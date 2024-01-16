/******************************************************************************
                           Social Media Network
*******************************************************************************/

public class SocialNetwork
{
  public static void main (String[]args)
  {
    //create users
    User user1 = new User ("khushi");
    User user2 = new User ("John");
    User user3 = new User ("Irish");

    //Add friends
      user1.addfriend (user2);
      user1.addfriend (user3);

    //create posts
      user1.createPost ("Good Morning!");
      user2.createPost ("Happy Birthday!");
      user3.createPost ("Good Night!");

    //Display
      user1.display ();
  }
}
