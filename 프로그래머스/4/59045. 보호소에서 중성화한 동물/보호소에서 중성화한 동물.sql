SELECT I.ANIMAL_ID, -- 동물 ID
       I.ANIMAL_TYPE, -- 동물 종류
       O.NAME -- 이름
    from ANIMAL_INS I -- 동물이 들어올 때 테이블
        join ANIMAL_OUTS O on O.ANIMAL_ID = I.ANIMAL_ID -- ANIMAL_ID(동물 ID)를 기준으로 JOIN(연결)
    where (I.SEX_UPON_INTAKE like 'Intact%' and O.SEX_UPON_OUTCOME like 'Neutered%') 
            -- 들어올 때 Intract이 있다는 것은 중성화 X and 나갈때 Neutered을 포함하면 중성화시술을 했다.(보호소에서 한 경우)
        or (I.SEX_UPON_INTAKE like 'Intact%' and O.SEX_UPON_OUTCOME like 'Spayed%')
            -- 들어올 때 Intract이 있다는 것은 중성화 X and 나갈때 Spayed을 포함하면 중성화시술을 했다. (보호소에서 한 경우)