package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {

		String[] arr = { "file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img" };
		
		// 1. 파일 목록 중 txt 파일만 찾으세요
		Stream<String> stream1 = Arrays.stream(arr);
		stream1
				.filter(n -> n.endsWith("txt"))
				.forEach(n -> System.out.print(n + " ")); // file1.txt file3.txt file5.txt 
		
		System.out.println();
		
		// 2. 확장자별로 파일의 개수를 구하세요
		Stream<String> stream2 = Arrays.stream(arr);
		long txt = stream2
							.filter(n -> n.endsWith("txt"))
							.count();
		System.out.println("txt파일의 개수: " + txt); // 3
		
		Stream<String> stream3 = Arrays.stream(arr);
		long pdf = stream3
							.filter(n -> n.endsWith("pdf"))
							.count();
		System.out.println("pdf파일의 개수: " + pdf); // 1
		
		Stream<String> stream4 = Arrays.stream(arr);
		long img = stream4
							.filter(n -> n.endsWith("img"))
							.count();
		System.out.println("img파일의 개수: " + img); // 2
		
		// 3. 파일의 확장자만 추출하여 출력하세요
		// (.점은 \\.으로 표현)
		Stream<String> stream5 = Arrays.stream(arr);
		stream5
				.map(n -> {
					String[] strArr = n.split("\\."); // ["file1", "txt"]
					return strArr[1]; // strArr[0] => 파일 이름
				})
				.distinct() // 중복 제거
				.forEach(n -> System.out.print(n + " ")); // txt pdf img 
		
		// file1.txt, file2.pdf, file3.txt, file4.img, file5.txt, file6.img
		// => file1, txt, file2, pdf, file3, txt, file4, img, file5, txt, file6, img
		// => txt, pdf, txt, img, txt, img
		// => txt, pdf, img
		
	}

}
