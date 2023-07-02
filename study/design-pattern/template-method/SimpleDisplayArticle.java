import java.util.List;

public class SimpleDisplayArticle extends DisplayArticleTemplate {
	public SimpleDisplayArticle(Article article) {
		super(article);
	}

	@Override
	protected void title() {
		System.out.println(article.title());
	}

	@Override
	protected void content() {
		List<String> content = article.content();
		for (String s : content) {
			System.out.println(s);
		}
	}

	@Override
	protected void footer() {
		System.out.println(article.footer());
	}
}

