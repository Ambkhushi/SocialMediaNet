class Post
{
  private User author;
  private String content;

  public Post (String content, User author)
  {
    this.content = content;
    this.author = author;
  }
  public String getContent ()
  {
    return content;
  }
  public User getAuthor ()
  {
    return author;
  }
}
