// Cac thanh phan Non-Static: Variable, Block, User Method, Constructor

// static > main > instant cua class  (non-static > Constructor) 

// static > static method > main 

// package la 1 folder chua cac file java

/*
 * Static members: Belong to the class Accessed using Class Name Static block is
 * Executed at the time of class loading Memory is allocated and variables are
 * initializes during class loading
 */

/*
 * Non-Static members: Belong to the object Accessed using the object name Time
 * of object creation At time of object creation
 */

/*
 * Implicit Casting Gan bien kieu thap hon sang kieu lon hon thi ko co van de gi
 */

/* Compiler => Javac: JRE Java Runtime Environment */

/*
 * Locale
 */

/*
 * SimpleDateFormat
 */

/*
 * randomIndex
 */

/*
 * LocalDate
 */

/*
 * so sanh == vs .equals
 */

//		// String's methods
//		String str = "Hoc Java rat kho";
//		System.out.println("Length = " + str.length());
//		System.out.println("Trim()" + str.trim());
//		System.out.println("UpperCase()" + str.toUpperCase());
//		System.out.println("LowerCase() " + str.toLowerCase());
//		String[] split = str.split(" ");
//		System.out.println("Item = " + split.length);
//		for (String ss : split) {
//			System.out.println(ss);
//		}

//		// String Comparing
//		String s1 = "abc";
//		  String s2 = "xyz";
//		  String s3 = "abc";
//		  String s4 = new String("abc");
//		  System.out.println("s1 = " + s1.hashCode());
//		  System.out.println("s2 = " + s2.hashCode());
//		  System.out.println("s3 = " + s3.hashCode());
//		  System.out.println("s4 = " + s4.hashCode());
//		  System.out.println("s1 == s3: " + s1 == s3);
//		  System.out.println("s1.equals(s3): " + s1.equals(s3));
//		  System.out.println("s1 == s3: " + s1 == s4);
//		  System.out.println("s1.equals(s4): " + s1.equals(s4));

// noi String
// 		System.out.println("S1.append(s2) = " + s1.concat(s2));

/*
 * scanner.nextLine()
 * 
 * vd: System.out.println("Nhap vao Full Name cua ban: "); acc.fullName =
 * sc5.nextLine(); sc5.nextLine();
 * System.out.println("Nhap vao Email cua ban: "); acc.email = sc5.next(); khi
 * chạy lệnh này, mình nhập dữ liệu xong, bấm enter, thì dữ liệu sẽ đc đẩy đi ra
 * console, nhưng enter nó vẫn bị hiểu là 1 kí tự, nên 'enter' sẽ được lưu lại
 * dẫn tới nó đẩy tiếp 1 lệnh scanner tiếp theo ở dưới nữa, khiến mình ko nhập
 * đc giá trị cho lệnh scanner đó
 * 
 * Khắc phục: thêm scanner.nextLine() sau lệnh nextLine
 */

/*
 * scanner.useDelimiter(System.lineSeparator());
 */

// .this 

// Nạp chông phương thức (Method ovẻloading) triển khai: gắn kết tĩnh (static binding) và đa hình khi biên dịch
// Ghi đè phương thức triển khai đa hình tại runtime
// 1 Class có thể triển khai nhiều Interface

/*
 * -- ArrayList<> co 2 cach tao ArrayList, tham khao cach 1 bai Ass4_Ex05 va
 * cach 2 cua mentor Ass4_Ex06
 */

/*
 * -- .getBytes() https://viettuts.vn/java-string/phuong-thuc-getbytes
 */

/*
 * -- Final https://viettuts.vn/java/tu-khoa-final-trong-java
 */

/*
 * -- Static https://viettuts.vn/java/tu-khoa-static-trong-java
 */

/*
 * -- Abstract Có thể khai báo các method trừu tượng bên trong Abstract Class 
 * 		Ko thể khởi tạo 1 object từ Abstract Class
 */

/*
 * -- printf
 */

/*
 * -- Boxing & Unboxing
 */

/*
 * -- substring() 
 */

/*
 * -- trim() : xoa khoang trang o dau & cuoi chuoi ( o giua KO XOA )
 */

/*
 * -- Chuyen 1 ki tu String thanh char
 * System.out.println("Nhap vao ki tu muon thay the...");
		char c1 = sc14.next().toCharArray()[0];
 */

/*
 * -- resourceBundle
 */

