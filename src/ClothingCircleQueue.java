package src;

import model_linkedlists.CircleQueue;
//import model_questions.Question;
//import model_questions.Question;
//import Util.ConsoleMethods;;

/**
 *  Establish  a set of random questions.
 *
 * @author     John Mortensen
 * @created    December 24, 2019
 */
public class ClothingCircleQueue {

  private CircleQueue clothes;
  private int size = 2;	// size of test
  private int questionTypes = 3;	// randomization
  private boolean init = true;

  /**
   *  APexam with default amount of questions
   */ 
  public ClothingCircleQueue()
  {
	  init();
  }

  /**
   *  APexam with custom amount of questions
   */
  public ClothingCircleQueue(int size)
  {
	  this.size = size;
	  init();
  }
  
  /**
   *  Constructor helper
   */
  private void init()
  {
	  clothes = new CircleQueue();
	  createTest();
  }
  
  /**
   *  Creates a series of user defined objects and populates on Stack,
   *  any type of object can be used,
   *  stack pushes and operations are displayed to console
   */
  public void createTest()
  {	
	  	Clothing q;

	  	// pushing data to stack with console outputs
	  	/*for (int i = 0; i <= size-1; i++)
		{
	  		switch((i)%questionTypes) {
	  			case 0:
	  				q = new Clothing(//parameters for shirt);
	  				break;
	  			case 1:
	  				q = new Clothing(//parameters for pants);
	  				break;
	  			case 3:
	  				q = new Clothing(//parameters for shoes);
	  				break;
	  			case 4:
	  				q = new LoopFile();
	  				break;
	  			case 5:
	  				q = new FinalArrayList();
	  				break;
	  			case 6:
	  				q = new RecursionFile();
	  				break;
	  			case 7:
	  				q = new PolymorphFile();
	  				break;
	  			case 8:
  				default:
	  				q = new BinaryMathQuestions();
	  				break;
	  		}
	  		q.setID(i+1);
  			exam.add(q);
		}*/
	  	
  }
  
  /**
   *  Removes all the user defined objects from Stack,
   *  this is inverse of createStack,
   *  stack pops and values are displayed to console 
   */
  public void emptyQueue()
  {
	  	// popping data off stack with console output
	  	for (int i = 0; i <= size; i++)
	  	{
	  		clothes.delete();
	  	}
  }

  /**
   *  Display the top element of the list and full stack
   */
  public void displayClothes()
  {
    System.out.println("First Element: " + clothes.getFirstObject() );
    System.out.println("Last Element: " + clothes.getLastObject() );
    System.out.println("Full Queue: " + clothes);
  }
  
  /**
   *  Get current test question and advance pointer
   */
  
  public Clothing getClothingFwd()
  {
	  Clothing q;	// put object back into Question type

	  if (init) {
		  q = (Clothing)clothes.getFirstObject();
		  init = false;
	  } else {
		  clothes.setNext();
		  q = (Clothing)clothes.getObject();
	  }
	  
	  return q;	
  }
  
  /**
   *  Get current test question and advance pointer
   */
  public Clothing getQuestionRev()
  {
	  Clothing q;	// put object back into Question type

	  if (init) {
		  q = (Clothing)clothes.getLastObject();
		  init = false;
	  } else {
		  clothes.setPrevious();
		  q = (Clothing)clothes.getObject();
	  }
	  
	  return q;	
  }
//test

  /**
   *  Demonstrates the use of the LinkedList used as storing questions.
   *
   * @param  args  The command line arguments (not used)
   */
  public static void main(String[] args)
  {
	// Initialize and show elements
	System.out.println("Initialize exam");
    ClothingCircleQueue exam = new ClothingCircleQueue();
    exam.displayClothes();
    
    // Empty queue and show elements
	System.out.println("Empty exam");
    exam.emptyQueue();
    exam.displayClothes();
  }
}

