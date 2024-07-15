package java_medium1.enumeration.test.http;

/*
*
* 문제와 풀이2
**문제 설명**
`enumeration.test.http` 패키지를 사용하자.
`HttpStatus` 열거형을 만들어라.
HTTP 상태 코드 정의

* `OK`
code: 200
message: "OK"

* `BAD_REQUEST`
code: 400
message: "Bad Request"

* `NOT_FOUND`
code: 404
message: "Not Found"

* `INTERNAL_SERVER_ERROR`
code: 500
message: "Internal Server Error"
* */

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        for (HttpStatus status : values()) {
            if (status.getCode() == httpCodeInput) {
                return status;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}
