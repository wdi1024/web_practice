-- Article.java에서 GeneratedValue에 GenerationType.IDENTITY를 적용함으로써 자동생성 가능한 id열 제거
INSERT INTO article(title, content) VALUES('가가가가', '1111');
INSERT INTO article(title, content) VALUES('나나나나', '2222');
INSERT INTO article(title, content) VALUES('다다다다', '3333');

-- 22강: article 더미 데이터
INSERT INTO article(title, content) VALUES('당신의 인생 영화는?', '댓글 ㄱ');
INSERT INTO article(title, content) VALUES('당신의 소울 푸드는?', '댓글 ㄱㄱ');
INSERT INTO article(title, content) VALUES('당신의 취미는?', '댓글 ㄱㄱㄱ');
-- 22강: comment 더미 데이터
---- 4번 게시글의 댓글들
INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Park', '굳 윌 헌팅');
INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Kim', '아이 엠 샘');
INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Choi', '쇼생크의 탈출');
---- 5번 게시글의 댓글들
INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Park', '치킨');
INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Kim', '샤브샤브');
INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Choi', '초밥');
---- 6번 게시글의 댓글들
INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Park', '조깅');
INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Kim', '유튜브');
INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Choi', '독서');