public abstract class DisplayArticleTemplate {
    protected Article article; // 파생 클래스에서 접근할 수 있도록 protected 접근자 사용

    protected DisplayArticleTemplate(Article article) {
        this.article = article;
    }

    public final void display() { // 파생 클래스에서 display 메서드를 변경할 수 없도록 강제
        title();
        content();
        footer();
    }

    // display에 있는 메서드들을 구현 없이 선언.
    protected abstract void title();
    protected abstract void content();
    protected abstract void footer();
}

