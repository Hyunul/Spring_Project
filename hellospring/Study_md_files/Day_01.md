```java
@GetMapping("hello")
public String hello(Model model) {
    model.addAttribute("data", "hello!!");
    return "hello";
}

@GetMapping("hi")
public String he(Model model) {
    model.addAttribute("data", "Hi!");
    return "hi";
}
```

@GetMapping("??") : ??파일과 매핑.
return ?? : 데이터가 씌워진 ?? 이름의 뷰(html파일)를 반환함

```java
// @ResponseBody 문자 반환
@GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name;
    }
```

@ReponseBody : http 요청 body를 자바 객체로 전달받을 수 있게 해줌.
즉, 위에서는 @RequestParam으로 name 변수에 값을 전달하고 이를 "hello"와 더한 것을 자바 객체로 반환해줌.

따라서 화면(body)에는 hello + name을 전달받은 hello-string 뷰가 출력된다.

```java
// @ResponseBody 객체 반환
@GetMapping("hello-api")
@ResponseBody
public Hello helloApi(@RequestParam("name") String name) {
    Hello hello = new Hello();
    hello.setName(name);
    return hello;

}

static class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

@ResponseBody를 사용하여 객체를 반환하면 객체가 JSON으로 변환된다.
