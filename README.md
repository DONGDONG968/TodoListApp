# 📌 ToDo List App (안드로이드)

간단한 할 일 목록을 입력하고 관리할 수 있는 Android 기반 ToDo List 앱입니다.  
Kotlin과 RecyclerView를 활용하여 기본적인 CRUD 기능을 구현했습니다.

---

## 🖥️ 실행 화면 

<img src="https://github.com/DONGDONG968/TodoListApp/blob/main/Screenshot.jpg" width="200" />


## 🛠️ 기술 스택

| 항목 | 내용 |
|------|------|
| Language | Kotlin |
| IDE | Android Studio |
| SDK | minSdk 21 이상 |
| UI | XML 기반 레이아웃 |
| 아키텍처 | 단순 Activity 기반 (MVC 유사) |
| 라이브러리 | 기본 AndroidX 컴포넌트만 사용 |

---

## ✨ 주요 기능

- ✅ 할 일 입력
- ✅ 할 일 추가 버튼
- ✅ 체크박스로 완료 표시
- ✅ 휴지통 버튼으로 삭제
- ✅ XML에서 문자열 리소스 분리 (`@string/todo_hint`)
- ✅ RecyclerView + Adapter 활용

---

## 🧩 파일 구조

📦 TodoListApp
┣ 📁 layout
┃ ┣ 📄 activity_main.xml ← 메인 UI
┃ ┗ 📄 item_todo.xml ← 각 할 일 아이템 UI
┣ 📄 MainActivity.kt ← 앱 메인 로직
┣ 📄 Todo.kt ← 데이터 클래스
┣ 📄 TodoAdapter.kt ← RecyclerView Adapter
┗ 📄 README.md ← 프로젝트 설명 문서