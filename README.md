# 데이터 아키텍처 설계 - 시험

### 순서
- 스프링부트 프로젝트 세팅
- 테이블 생성 boardTbl(id, title, content, createDate)
- 더미데이터 만들기 10건!!
- mustache 메인 페이지 (부트스트랩 테이블, 검색바)
- JPA에 제공하지 않기 때문에 네이티브 쿼리 생성
```sql
SELECT * FROM boardTbl WHERE title like '%:keyword%';
```
- mustache에서 form 태그로 요청  or fetch 요청

### 팁
- Get요청은 a태그, form태그
- Get요청을 fetch로 하는 경우 - 어떤 경우일지?