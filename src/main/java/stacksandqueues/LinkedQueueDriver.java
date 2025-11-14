package stacksandqueues;

/**
 * A driver program to test the Queue class implemented with linked nodes 
 * @author William McDaniel Albritton 
 */
    public class LinkedQueueDriver {
       
   /**Driver code to test class
   * @param arguments Commandline arguments not used */
       public static void main(String[] arguments) { 
       //make Queue of Integers
       //use Interface in declaration (left of equals)
       //use class to instantiate object (right of equals)
       //syntax: Interface variable = new Class(); 
         QueueInterface<Integer> queue 
         = new LinkedQueue<Integer>();
         
      //test empty   
         System.out.println("Is queue empty? " + queue.empty());
      //test poll from an empty queue
         System.out.println("queue.poll() = " + queue.poll());
      //test peek from an empty queue
         System.out.println("queue.peek() = " + queue.peek()); 
         System.out.println();
       
       //test offer
         System.out.println("test offer:");		 
         Integer number = Integer.valueOf(0);
         for(int i=0;i<7;i++){
            number = number + 10;
            System.out.println("queue.offer("+number+") = "+ queue.offer(number));
         }
         System.out.println("Is queue empty? " + queue.empty());
         System.out.println();
      
       //test peek
         System.out.println("test peek:");
         System.out.println("queue.peek() = " + queue.peek()); 
         System.out.println();
      	                	  
      //test poll
         System.out.println("test poll:");
         for(int i=0;i<8;i++){
            System.out.println("queue.poll() = " + queue.poll());
         }
         System.out.println("Is queue empty? " + queue.empty());
         System.out.println();
      		
      //test offer and poll
         System.out.println("test offer and poll:");
         for(int i=0;i<5;i++){
            number = number + 10;
            System.out.println("queue.offer("+number+") = "+ queue.offer(number));
         }
         for(int i=0;i<6;i++){
            System.out.println("queue.poll() = " + queue.poll());
         }
         for(int i=0;i<5;i++){
            number = number + 10;
            System.out.println("queue.offer("+number+") = "+ queue.offer(number));
         }
         for(int i=0;i<6;i++){
            System.out.println("queue.poll() = " + queue.poll());
         }	  
      }//end of main()
   
   }// end class

    /*PROGRAM OUTPUT:
    Is queue empty? true
    queue.poll() = null
    queue.peek() = null

    test offer:
    queue.offer(10) = true
    queue.offer(20) = true
    queue.offer(30) = true
    queue.offer(40) = true
    queue.offer(50) = true
    queue.offer(60) = true
    queue.offer(70) = true
    Is queue empty? false

    test peek:
    queue.peek() = 10

    test poll:
    queue.poll() = 10
    queue.poll() = 20
    queue.poll() = 30
    queue.poll() = 40
    queue.poll() = 50
    queue.poll() = 60
    queue.poll() = 70
    queue.poll() = null
    Is queue empty? true

    test offer and poll:
    queue.offer(80) = true
    queue.offer(90) = true
    queue.offer(100) = true
    queue.offer(110) = true
    queue.offer(120) = true
    queue.poll() = 80
    queue.poll() = 90
    queue.poll() = 100
    queue.poll() = 110
    queue.poll() = 120
    queue.poll() = null
    queue.offer(130) = true
    queue.offer(140) = true
    queue.offer(150) = true
    queue.offer(160) = true
    queue.offer(170) = true
    queue.poll() = 130
    queue.poll() = 140
    queue.poll() = 150
    queue.poll() = 160
    queue.poll() = 170
    queue.poll() = null
*/
    