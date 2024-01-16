import java.util.ArrayList;

class User
{
  private String username;
  private ArrayList < User > friends;
  private ArrayList < Post > posts;

  public User (String username)
  {
    this.username = username;
    this.friends = new ArrayList <> ();
    this.posts = new ArrayList <> ();
  }

  public String getUsername ()
  {
    return username;
  }

  public void addfriend (User friend)
  {
    friends.add (friend);
  }
  public void createPost (String content)
  {
    Post post = new Post (content, this);
    posts.add (post);
  }
  public void display ()
  {
    System.out.println ("User:" + username);
    System.out.println ("Posts:");
  for (Post post:posts)
      {
	System.out.println (post.getContent ());
      }
    System.out.println ("Friends:");
  for (User friend:friends)
      {
	System.out.println (friend.getUsername ());
      }
  }
}
