# 
<p dir="rtl">برای توسعه برنامه خواسته شده به روش آزمون محور (TDD) ابتدا کلاس تست مربوط به همراه توابع تست مناسب را ایجاد می کنیم :
</p>


```java
class TestClass {
    @Test
    void CalculateRectangleArea(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(30);
        rectangle.setWidth(20);
        assertEquals(600, rectangle.calculateArea());
    }
    
    @Test
    void CalculateSquareArea(){
        Square square = new Square();
        square.setLength(20);
        assertEquals(400, square.calculateArea());
    }
}
```
<p dir="rtl"> که هرکدام از این توابع عملکرد درست مربوط به یکی از اشیاء مستطیل یا مربع را بررسی می کنند.
</p>
<p dir="rtl">
سپس برای رفع خطا ها اقدام به ایجاد کلاس های Rectangle و Square می کنیم. در اینجا باید توجه داشت که برای رعایت اصل سوم از اصول SOLID یا اصل Liskov substitution باید دو کلاس مجزا برای مستطیل و مربع تشکیل دهیم؛ زیرا در حالی که در ظاهر مربع نوعی مستطیل است و می توان کلاس مربع را فرزند کلاس مربع قرار داد، به دلیل تفاوت های کلاس مربع این کلاس ویژگی تعویض پذیری (substitutability) را نقض می کند و نمی توان آن را فرزند مستطیل قرار داد (برای مثال تابعی که بخواهد مساحت مستطیل را ده درصد افزایش دهد با کلاس مربع به درستی کار نمی کند).
</p>
<p dir="rtl">
کلاس مستطیل:
</p>

```java
public class Rectangle {
    private float height;
    private float width;

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float calculateArea(){
        return this.width * this.height;
    }
}
```
<p dir="rtl">
کلاس مربع:
</p>

```java
public class Square {
    private float length;

    public void setLength(float length) {
        this.length = length;
    }

    public float calculateArea(){
        return length * length;
    }
}
```
<p dir="rtl">
و در نهایت هر دو تست به درستی طی می شوند:
</p>

![img.png](img.png)