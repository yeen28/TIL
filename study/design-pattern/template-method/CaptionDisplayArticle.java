import java.util.List;

public class CaptionDisplayArticle extends DisplayArticleTemplate {
    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("TITLE: " + article.title());
    }

    @Override
    protected void content() {
        System.out.println("CONTENT: ");
        List<String> content = article.content();
        for (String s : content) {
            System.out.println(s);
        }
    }

    @Override
    protected void footer() {
        System.out.println("FOOTER: " + article.footer());
    }
}

