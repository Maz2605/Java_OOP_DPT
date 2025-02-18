# Hướng Dẫn Về Mảng Trong Java

## 1. Giới Thiệu
Mảng (Array) trong Java là một cấu trúc dữ liệu dùng để lưu trữ một tập hợp các phần tử có cùng kiểu dữ liệu. Các phần tử trong mảng được lưu trữ liên tiếp trong bộ nhớ và có thể truy cập bằng chỉ số (index).

---

## 2. Khai Báo Và Khởi Tạo Mảng
### 2.1. Khai Báo Mảng
```java
// Cách khai báo mảng
int[] arr1;
String[] arr2;
```

### 2.2. Khởi Tạo Mảng
```java
// Khởi tạo mảng với kích thước cố định
int[] numbers = new int[5];

// Khởi tạo mảng với giá trị ban đầu
int[] values = {1, 2, 3, 4, 5};
```

---

## 3. Truy Cập Phần Tử Trong Mảng
```java
int[] arr = {10, 20, 30, 40};
System.out.println(arr[0]); // 10
System.out.println(arr[2]); // 30
```

---

## 4. Các Phương Pháp Duyệt Mảng
### 4.1. Duyệt Mảng Bằng Vòng Lặp `for`
```java
int[] arr = {1, 2, 3, 4, 5};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### 4.2. Duyệt Mảng Bằng Vòng Lặp `for-each`
```java
for (int num : arr) {
    System.out.println(num);
}
```

---

## 5. Các Phép Toán Cơ Bản Với Mảng
### 5.1. Tìm Giá Trị Lớn Nhất, Nhỏ Nhất
```java
int[] arr = {3, 7, 2, 9, 4};
int max = arr[0];
int min = arr[0];
for (int num : arr) {
    if (num > max) max = num;
    if (num < min) min = num;
}
System.out.println("Max: " + max);
System.out.println("Min: " + min);
```

### 5.2. Tính Tổng Các Phần Tử
```java
int sum = 0;
for (int num : arr) {
    sum += num;
}
System.out.println("Tổng: " + sum);
```

### 5.3. Sắp Xếp Mảng (Dùng Arrays.sort)
```java
import java.util.Arrays;
int[] arr = {5, 3, 8, 1, 2};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 8]
```

---

## 6. Mảng Hai Chiều
### 6.1. Khai Báo Và Khởi Tạo Mảng 2 Chiều
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### 6.2. Duyệt Mảng Hai Chiều
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## 7. Hàm Và Hằng Trong Java
### 7.1. Định Nghĩa Hàm
```java
public static int add(int a, int b) {
    return a + b;
}
```

### 7.2. Hằng Trong Java (final)
```java
final double PI = 3.14159;
```

---

## 8. Các Thư Viện Sử Dụng Thường Xuyên Trong Java
```java
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
```

---

## 9. Wrapper Class
Wrapper Class giúp làm việc với các kiểu dữ liệu nguyên thủy trong Java dưới dạng đối tượng.
```java
Integer intObj = Integer.valueOf(10);
Double doubleObj = Double.valueOf(10.5);
int intValue = intObj.intValue();
```

---

## 10. Lưu Ý Quan Trọng Khi Sử Dụng Mảng
- Mảng có kích thước cố định, không thể thay đổi sau khi khởi tạo.
- Chỉ mục (index) của mảng bắt đầu từ `0`.
- Cần kiểm tra tránh truy cập ngoài phạm vi (`ArrayIndexOutOfBoundsException`).
- Sử dụng `Arrays.toString(array)` để in mảng một chiều.
- Sử dụng `Arrays.deepToString(array)` để in mảng hai chiều.

---



