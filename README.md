# Buckshot 룰렛




## **개요**


> **‘카카오 클라우드 스쿨 in Jeju’를 진행하며 제작한 CLI 프로그램입니다.**
>
- **프로젝트 이름** : Buckshot 룰렛
- **프로젝트 개발 기간** : 2024.05.16 ~
- **개발 언어** : Java 17
- **개발 IDE** : IntelliJ IDEA CE

## 코트 구조


```java
5-haisely-java-cli/
├── .idea/
│   └── (IDE configuration files)
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── buckshot/
│   │   │           ├── Core/
│   │   │           │   ├── GameManager.java
│   │   │           │   └── User.java
│   │   │           ├── Items/
│   │   │           │   ├── Beer.java
│   │   │           │   ├── Cigarette.java
│   │   │           │   ├── Handcuff.java
│   │   │           │   ├── Item.java
│   │   │           │   ├── Knife.java
│   │   │           │   ├── Magnifier.java
│   │   │           │   └── UserItem.java
│   │   │           └── Utils/
│   │   │               └── RandomUtils.java
│   │   └── resources/
│   │       └── (Resource files)
│   └── test/
│       ├── java/
│       │   └── (Test source files)
│       └── resources/
│           └── (Test resource files)
├── .DS_Store
├── .gitignore
├── README.md
├── build.gradle.kts
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

## 프로젝트 설명


- 플레이어 2명이 돌아가면서 자신 혹은 상대에게 총을 발사한다.
- 자신에게 발사할 총알이 공포탄인 경우 턴이 유지되고, 그 외의 경우 상대의 턴으로 넘어간다.
- 상대방의 체력이 0 이하가 되면 승리한다.

### 라운드

- 총에 3개~8개의 총알이 장전된다. (이 때, 공포탄과 실탄의 개수가 표기된다)
- 장전된 총알을 다 소모한 경우 라운드가 끝이난다.

### 사용자 턴

- 사용자는 자신의 턴에서 3가지 행동을 할 수 있다.
    - 아이템 사용
    - 자신에게 총을 쏘기
    - 적에게 총을 쏘기
- 아이템을 사용할 경우, 자신의 테이블에 있는 아이템 중 하나를 선택하여 사용할 수 있다.
- 자신에게 총을 쏜 경우, 공포탄이 발사되었을 때 턴이 넘어가지 않는다.
- 적에게 총을 쏜 경우, 무조건 상대에게 턴이 넘어간다.

## 프로젝트 플레이 방식

### 프로젝트 실행

- 게임 시작
    - 플레이어의 이름을 입력받는다. (Player 1, Player 2)
    - 플레이어의 이름을 출력한 뒤 라운드를 시작한다.
- 라운드 시작
    - 라운드 시작을 알린다. (Round 1)
    - 총에 랜덤하게 총알을 장착한다.
    - 장착한 총알의 실탄과 공포탄 수를 출력한다.
    - 플레이어 턴이 시작된다.

|게임 시작 화면 (플레이어 이름 입력)|라운드 시작 (총 장전, 아이템 분배)|
|:---:|:---:|
|![start](https://github.com/100-hours-a-week/5-haisely-java-cli/assets/98401161/200ad582-acbf-40da-9707-f2f45abc0285)|![game start](https://github.com/100-hours-a-week/5-haisely-java-cli/assets/98401161/37e8d374-baa3-4923-abf3-87e8cc51ea71)|

### 플레이어 턴

