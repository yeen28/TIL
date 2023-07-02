import java.util.ArrayList;

/**
 * Template Method Pattern (템플릿 메서드 패턴)
 */
public class Main {
	public static void main(String[] args) {
		String title = "template 디자인 패턴";

		ArrayList<String> content = new ArrayList<>();
		content.add("디자인 패턴입니다.");
		content.add("그 중 템플릿 메서드 패턴입니다.");

		String footer = "2023.06";

		Article article = new Article(title, content, footer);

		System.out.println("[1] Simple Display Article");
		SimpleDisplayArticle simpleDisplayArticle = new SimpleDisplayArticle(article);
		simpleDisplayArticle.display();

		System.out.println();

		System.out.println("[2] Caption Display Article");
		CaptionDisplayArticle captionDisplayArticle = new CaptionDisplayArticle(article);
		captionDisplayArticle.display();
	}
}
