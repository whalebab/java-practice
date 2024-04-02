package enumeration.test.http;

/*
실행 결과**
```
HTTP CODE: 200
200 OK
isSuccess = true
```
```
HTTP CODE: 400
400 Bad Request
isSuccess = false
```
```
HTTP CODE: 404
404 Not Found
isSuccess = false
```
```
HTTP CODE: 500
500 Internal Server Error
isSuccess = false
*/

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();
        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
