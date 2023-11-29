
public class App3 {

	class Shape {

	}
	class Circle extends Shape {
		public float calculateArea() {
			System.out.println("3.14 * r * r");
		}
	}

	class Rectangle extends Shape {
		public float calculateArea() {
			System.out.println("l * b");
		}
	}

	class Triangle extends Shape {
		public float calculateArea() {
			System.out.println("0.5 * b * h");
		}
	}

Shape s;{
	
s=new Circle();s.calculateArea(); // 3.14 * r * r

	s=new Rectangle();s.calculateArea(); // l * b

	s=new Triangle();s.calculateArea(); // 0.5 * b * h

}
}
