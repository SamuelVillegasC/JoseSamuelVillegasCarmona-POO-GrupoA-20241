public class Books{
  private   String name;
  private String author;
  private String user;
  private boolean isRented= false;
 public Books(String name, String author, String user){
   this.name =name;
   this.author = author;
 } 
  //Sobrecarga
  public Books(String name, String author){
     this.name =name;
     this.author = author;
   } 
  
  public String getname(){
    return name;
  }

  public String getauthor(){
    return author;
  }
  public String getuser(){
    return user;
  }
  public void setuser(String user){
    this.user = user;
  }
  public void setRented(boolean rented){
    this.isRented = rented;
  }
  public boolean isRented(){
    return isRented;
  }
  
}