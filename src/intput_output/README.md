# Java基本输入输出练习

[OJ在线编程常见输入输出练习场](https://ac.nowcoder.com/acm/contest/5657)


## 输入模板

```java
import java.util.Scanner;

Scanner in = new Scanner(System.in);

// 不要忘记关闭
in.close();
```

## 两数之和

OJ_01, OJ_02, OJ_03

```java
in.nextInt();
in.hasNextInt();
```

## 多数之和

OJ_04, OJ_05, OJ_06和两数之和一样的模板
OJ_07增加行读
```java
boolean flag = in.hasNextLine();
String[] arr = in.nextLine().split(" ");
int a = Integer.parseInt("123");
int b = Integer.valueOf("123");
```

## 字符串排序
OJ_08, OJ_09, OJ_10 新增排序方法
```java
import java.util.Arrays

Arrays.sort(arr);
```
注意`in.nextInt()`和`in.nextLine()`最好不要混用

## 注意题目给出的数据类型
OJ_11
```java
in.hasNextLong();
in.nextLong();
```

