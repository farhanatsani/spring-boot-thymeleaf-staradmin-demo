-- RRRRR

-- 전체 사용자 조회
SELECT * FROM user_sample;

-- 특정 사용자 조회 (예: 아이디로 조회)
SELECT * FROM user_sample WHERE id = 1;



-- CCCCC

-- 1번 사용자 추가
INSERT INTO user_sample (family_name, first_name, family_kana_name, first_kana_name, birthday, gender, office, tel, mail, is_quit)
VALUES ('김', '영희', 'キム', 'ヨンヒ', '1990-01-01', 'woman', 'iinexus', '010-1234-5678', 'younghee@iinexus.com', 0);

-- 2번 사용자 추가
INSERT INTO user_sample (family_name, first_name, family_kana_name, first_kana_name, birthday, gender, office, tel, mail, is_quit)
VALUES ('이', '철수', 'イ', 'チョルス', '1991-02-02', 'man', 'iinexus', '010-9876-5432', 'cheolsu@iinexus.com', 0);

-- 3번 사용자 추가
INSERT INTO user_sample (family_name, first_name, family_kana_name, first_kana_name, birthday, gender, office, tel, mail, is_quit)
VALUES ('박', '지민', 'パク', 'ジミン', '1992-03-03', 'man', 'iinexus', '010-4567-1234', 'jimin@iinexus.com', 0);



-- UUUUU

-- 1번 사용자의 전화번호와 메일 주소 수정
UPDATE user_sample
SET tel = '010-2222-3333', mail = 'modified.new@iinexus.com'
WHERE id = 1;



-- DDDDD

-- 3번 사용자 삭제
DELETE FROM user_sample WHERE id = 3;

-- (또는) 3번 사용자를 'quit' 상태로 변경
UPDATE user_sample
SET is_quit = 1
WHERE id = 3;