package java_medium2.collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size); // index 찾기 O(1), 데이터 추가(밀기) O(n)

        ArrayList<Integer> arrayList = new ArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size); // index 찾기 O(1), 데이터 추가 O(1)

        int loop = 10000; // 반복 횟수
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop, 0); // 앞에서 조회
        getIndex(arrayList, loop, size / 2); // 중간에서 조회
        getIndex(arrayList, loop, size - 1); // 마지막에서 조회

        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop, 0); // 앞에서 검색
        search(arrayList, loop, size / 2); // 중간에서 검색
        search(arrayList, loop, size - 1); // 마지막에서 검색

        System.out.println("==MyLikedList 추가==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size); // index 찾기 O(n), 데이터 추가 O(1)

        LinkedList<Integer> linkedList = new LinkedList<>(); // 조회용 데이터로 사용
        addLast(linkedList, size); // index 찾기 O(n), 데이터 추가 O(1)

        System.out.println("==MyLinkedList 조회==");
        getIndex(linkedList, loop, 0); // 앞에서 조회
        getIndex(linkedList, loop, size / 2); // 중간에서 조회
        getIndex(linkedList, loop, size - 1); // 마지막에서 조회

        System.out.println("==MyLinkedList 검색==");
        search(linkedList, loop, 0); // 앞에서 검색
        search(linkedList, loop, size / 2); // 중간에서 검색
        search(linkedList, loop, size - 1); // 마지막에서 검색
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i); // (i / 2): 대략 가운데 위치에 데이터 계속 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}