package com.section05


fun main(){
    /*
    1. 필터와 맵
    2. 다양한 컬렉션 처리 기능
    3. List to map
    4. 중첩 컬렉션 처리
     */

    val fruits = listOf(
        Fruit2(1,"apple", 1000,1000),
        Fruit2(2,"banana", 2000,1000),
        Fruit2(3,"apple", 1400,1000),
        Fruit2(4,"banana", 3000,1000),
        Fruit2(5,"apple", 1300,1000),
        Fruit2(6,"banana", 4000,1000),
        Fruit2(7,"apple", 1100,1000),
        Fruit2(8,"banana", 5000,1000),
        Fruit2(9,"수박", 2000,1000))


    // 필터사용가능
    fruits.filter {it.currentPrice > 1500}

    // 인덱스와 함께하는 filter
    fruits.filterIndexed { index, fruit -> index % 2 == 0 && fruit.currentPrice > 1500 }


    // map 도 가능  mapIndexed도 가능
    fruits.filter {it.currentPrice > 1500}
        .map { fruit -> fruit.name }


    // not null만 포함되는 map 가능
    fruits.filter {it.currentPrice > 1500}
        .mapNotNull { fruit -> fruit.name }


    // all : 모든 조건 만족해야 true
    fruits.all {it.currentPrice > 1500}


    // none : 모든 조건 불만족해야 true
    fruits.none {it.currentPrice > 1500}

    // any : 하나라도 만족하면 true
    fruits.any {it.currentPrice > 1500}


    // count
    fruits.count()

    // sortedBy
    fruits.sortedBy {it.currentPrice}

    // 내림차순 sortedByDescending
    fruits.sortedByDescending {it.currentPrice}

    // 변형된 값 기준으로 중복제거
    fruits.distinctBy {it.name}

    // first는 null이 아니어야하고 null도 포함하려면 firstOrNull 사용 가능
    fruits.first()
    fruits.firstOrNull()

    // last는 null이 아니어야하고 null도 포함하려면 lastOrNull 사용 가능
    fruits.last()
    fruits.lastOrNull()

    // List to Map
    val groupBy: Map<String,List<Fruit2>> = fruits.groupBy { fruit -> fruit.name }

    //associateBy란? key와 value를 같이 넣어주는 함수
    val groupBy2: Map<String,Fruit2> = fruits.associateBy { fruit -> fruit.name }

    // 과일이름 , List<출고가>
    val mapValues: Map<String,List<Long>> = fruits.groupBy ({ it.name }, { fruit -> fruit.factoryPrice })

    //중첩 리스트처리

    val fruits2 = listOf(
        listOf(        Fruit2(1,"apple", 1000,1000),
            Fruit2(2,"banana", 2000,1000),
            Fruit2(3,"apple", 1400,1000)),
        listOf(
            Fruit2(1,"apple", 1000,1000),
            Fruit2(2,"banana", 2000,1000),
            Fruit2(3,"apple", 1400,1000)
        )
    )

    // 전체 평탄화
    fruits2.flatMap { list -> list }
    // 조건 (람다식)
    fruits2.flatMap { list-> list.samePriceFilter}

}

val List<Fruit2>.samePriceFilter: List<Fruit2>
    get() = this.filter(Fruit2::isSamePrice)


data class Fruit2(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
){
    val isSamePrice: Boolean
        get()= factoryPrice == currentPrice

}