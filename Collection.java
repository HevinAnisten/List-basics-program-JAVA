import java.util.*;
import java .util.Scanner;
	public class Collection
	{
		Scanner scanner = new Scanner(System.in);
		
		public static void main(String args[]) 
		{
			Collection c = new Collection();
		
            			
			System.out.println("Create : 1");
			System.out.println("Copy list: 2");
			System.out.println("check the element : 3");
			System.out.println("Get the elements by index number: 4");
			System.out.println("The existance of an element in a List and get it's index number: 5");
			System.out.println("find the elementIndex: 6");
			System.out.println("Copy list: 7");
			System.out.println("Remove indexA to indexB: 8");
			System.out.println("The list is empty or not: 9");
			System.out.println("List to Array convert : 10");
			System.out.println("iterator thorugh the iterator object : 11");
			System.out.println("print List of elements in forward and reverse order using iterator : 12");
			System.out.println("Remove element in list using iterator:13");
			System.out.println("Remove value in the list using list method : 14");
			System.out.println("Store List of Maps in the List : 15");
			System.out.println("Modify map in using Key :16");
			System.out.println("Remove the value in map based on key :17");
			System.out.println("remove value in map using iterator: 18");
			System.out.println("Make the List to store only String values:19 ");
            System.out.println("check the existance of List of elements in the original List:20 ");			
			System.out.println("inserting an element in the middle of a List :21 ");
			System.out.println("find all the indexes of an element in the List in forward and reverse order: 22");
			System.out.println("create a new List from set of elements in the original List :23");
			System.out.println("");
			System.out.println("Select the number:");
			int swit = c.scanner.nextInt();
			
			switch(swit){
			
					case 1:
					
						Create();
						break;
						
					case 2:
						
						Modifyed_list();
						break;
					
					case 3:
					
						Copy_List();
						break;
						
					case 4:
					
						ElementToCheck();
						break;
						
					case 5:
					
						Existance();
						break;
						
					/*case 6:
						findIndex();
						break;*/
					case 7:
					
						EmptyList();
						break;
						
					case 8:
					
						RemoveIndex();
						break;
						
					case 9:
						EmptyOrNot();
						break;
						
					case 10:
						ListToArray();
						break;
						
					case 11:
						IteratorSample();
						break;
						
					case 12:
						IteratorReverse();
						break;
						
					case 13:
						IteratorRemove();
						break;
					case 14:
						RemoveList();
						break;
					case 15:
						ListOfMaps();
						break;
					case 16:
						ModifyMap();
						break;
					case 17:
						DeleteMap();
						break;
					case 18:
						RemoveMethodOfIterator();
						break;
					case 19:
						ListToStore();
						break;
					case 20:
						existanceOfList();
						break;
					case 21:
						InsertElement();
						break;
					case 22:
						ElementIndexes();
						break;
					case 23:
						ElementsList();
						break;

						default:
					
						System.out.println("The particular number not valid");
			}
					
					
				
	}
	
	//Create a list 
	
			public static void Create(){
		
				Collection c1 = new Collection();
			
				ArrayList<String>alist = new ArrayList<String>();
				
				System.out.println("How many district you want : ");
				int n = c1.scanner.nextInt();
				
				for (int i = 0; i<n ; i++){
					System.out.println("The city's are: ");
					String c = c1.scanner.next();
					alist.add(c);
				}
				
					System.out.println(alist);
					
				
				for(String i:alist){
				
					System.out.println(i);
				}
     
	
	// Get an elements by its index number()
	
				
				System.out.println("get the first index  value of: "+alist.get(1));
				
	//  update in the list
				
				alist.set(0,"vadugarpet");
				System.out.println("set the value of zero index: "+alist);
				
	// Remove the element in the list
			
				alist.remove(2);
				System.out.println("Remove the value of second index value: "+alist);
	}		
	
	// List object into the list
		 
		   public static void Modifyed_list(){
				
				Collection c2 = new Collection();
				
					ArrayList<String>alist1 = new ArrayList<String>();
					alist1.add("baahubali");
					alist1.add("minnale");
					alist1.add("horry botter");
				
				ArrayList<String>alist2 = new ArrayList<String>();
					alist2.add("Gautham Vasudev Menon");
					alist2.add("Rajamouli");
					alist2.add("David Heyman");
				
					alist1.addAll(alist2);
				System.out.println("modifyed us :"+alist1);
		
		  }
		  
	// orginal list to copy list
	
		  public static void Copy_List(){
			
				Collection c3 = new Collection();
			
				List<String> originalList = new ArrayList<>();
					originalList.add("vijay");
					originalList.add("ajith");
					originalList.add("maddy");
				List<String> copiedList = new ArrayList<>(originalList);
				System.out.println("Original List: " + originalList);
				System.out.println("Copied List: " + copiedList);
				
		}
					
				
	//  check the values using contain function 
			
			public static void ElementToCheck(){
				
				Collection c4 = new Collection();
			
				
				List<String> myList = new ArrayList<>();
					myList.add("Apple");
					myList.add("Banana");
					myList.add("Orange");
				String elementToCheck = "Banana";
				if (myList.contains(elementToCheck)) 
				{
            
					int index = myList.indexOf(elementToCheck);
					System.out.println("Element '" + elementToCheck + "' found at index: " + index);
				} 
				else 
				{
					System.out.println("Element '" + elementToCheck + "' not found in the List.");
				}
				
			}
			
	// check the existance of an element in a List and get it's index number

			
			public static void Existance() {
				
				Collection c5 = new Collection();
			
				
					List<String> myList = new ArrayList<>();
						myList.add("Trichy");
						myList.add("Karur");
						myList.add("Vilupuram");
						myList.add("Nagai");
						myList.add("Mailaduthurai");
						System.out.println("The element Trichy is available in ArrayList? " + myList.contains("Trichy"));
						System.out.println("The element salem is available in ArrayList? " + myList.contains("salem"));
			}
			
			
			
			/*public static void findIndex(){
       
				public static String findIndex(String arr[], String t) 
					{ 

						ArrayList<String> clist = new ArrayList<>(); 
  
						for (String i : arr) 
						clist.add(i); 
   
						return clist.indexOf(t); 
					} 
    
			public static void main(String[] args) 
				{ 
					String[] my_array = { "TRICHY","KARUR","NAGAI","KADALUR","VILUPURAM","CHENNAI","VIRUTHUNAGR" }; 
					System.out.println("Index position of TRICHY is: "+ findIndex(my_array, "TRICHY")); 
        System.out.println("Index position of CHENNAI is: "+ findIndex(my_array, "CHENNAI")); 
                } 
			}*/
			
	public static void EmptyList(){
			
	 List<String> myList = new ArrayList<>();
        myList.add("TRICHY");
        myList.add("CHENNAI");
        myList.add("KADALUR");

        System.out.println("Original List: " + myList);

        // Empty the list
        myList.clear();

        System.out.println("List after clearing: " + myList);
		
	}
	
	//creat list and remove start to end value based on index
	
	public static void RemoveIndex(){
		
		Collection c6 = new Collection();
		
		
		List<String>myList= new ArrayList<>();
		
		myList.add("TRICHY");
        myList.add("CHENNAI");
        myList.add("KADALUR");
		myList.add("THIRUNALVELI");
        myList.add("KANCHIPURAM");
        myList.add("DHINDUGAL");
		
		
		
		System.out.println("Size of list: " +myList.size());
		
		System.out.println("myList = "+myList);
		
	for(int i=0;i<=3;i++){
		System.out.println("i"+i);
		
		System.out.println(myList.remove(1));
			

	}
		System.out.println("Now size of list : "+myList.size());
		System.out.println(myList);	
	}
		
		
//The list value is empty or not
		
		public static void EmptyOrNot(){
			
			Collection c7 = new Collection();
			
			List<String> str = new ArrayList<>();
			str.add("hevin");
			str.add("willbin");
			
			System.out.println("myList is:"+str);
			
			if(str.isEmpty()){
				
				System.out.println("list is  empty:"+str);
			}
			else {
				System.out.println("List is not empty:"+str);
			
			}
		}
			
// list convert to array 
			
			public static void ListToArray() {
				
				Collection c8 = new Collection();
				
				List<Integer>myList=new ArrayList<>();
				
				myList.add(10);
				myList.add(100);
				myList.add(1000);
				myList.add(10000);
				myList.add(100000);
				myList.add(1000000);
				myList.add(10000000);
				
				System.out.println("myList is: "+myList);
				
				Integer[] myArray = myList.toArray(new Integer[0]);
				System.out.println("Array elements: ");
				
				for (Integer element : myArray){
					
					System.out.println(element);
				}
				
			}
			
// iterator through iterator object

	public static void IteratorSample(){
		
		Collection c9 = new Collection();
		
		List<String> myList= new ArrayList<>();
		 myList.add("Red");
		 myList.add("blue");
		 myList.add("green");
		System.out.println("my list is: "+ myList);
		
		Iterator<String> iterator = myList.iterator();
		
		while(iterator.hasNext()){
			
			String values = iterator.next();
			System.out.println(values);

		
		
	}
		
	
  }	

 // print List of elements in forward and reverse order 

public static void IteratorReverse(){

		Collection c10 = new Collection();
		
		List<String> myList= new ArrayList<>();
		myList.add("Red");
		myList.add("blue");
		myList.add("green");
		myList.add("voilet");
		myList.add("white");
		
	//forward order using iterator	
	
		System.out.println(" Forward order using iterator: ");
		
		Iterator<String> iterator = myList.iterator();
		
		while (iterator.hasNext()) {
			
			String element = iterator.next();
			System.out.println(element);
		}
	// Reverse order using iterator
	
		System.out.println("Reverse order using iterator : ");
		
		ListIterator<String> listIterator = myList.listIterator(myList.size());
		
		while (listIterator.hasPrevious()) {
			
			String element = listIterator.previous();
			System.out.println(element);
			
		}
			
    }	

	// Remove value in list using iterator

  public static void IteratorRemove(){
	  
	  Collection c11 = new Collection();
	  
		  List<String> myList = new ArrayList<>();
		  myList.add("choclate");
		  myList.add("ice cream");
		  myList.add("burgar");
		  myList.add("dosa");
		  
		  System.out.println("Orginal List : "+myList);
	  for (String elements : myList){
			
			System.out.println(elements);
	  }
	  
	  // create iterator
	  
	  Iterator<String> iterator = myList.iterator();
	  
	    while (iterator.hasNext()){
		
			String element = iterator.next();
			
		if("burgar".equals(element)){
			iterator.remove();
			}	
		}	
			System.out.println("After removeing list values:");
		
		for (String elements : myList){
			
			System.out.println(elements);
				
			}
		}
  
  public static void RemoveList(){
	  
	  Collection c12 = new Collection();
	  
	  List<String> myList = new ArrayList<>();
	  
	  myList.add("bigshow");
	  myList.add("john cena");
	  myList.add("untertakker");
	  myList.add("seth lawrance");
	  myList.add("roman rains");
	  
	  System.out.println("Orginal list : ");
	  
	  for ( String element : myList){
		  System.out.println(element);
	     }
	  
	  //remove an element using list method
	  
	  myList.remove("seth lawrance");
	  
	  System.out.println("After removing list values:");
		for(String element : myList){
			System.out.println(element);
		}
	  
  }

public static void ListOfMaps(){
	
	Collection c13 = new Collection();
	
	// create a list to store maps
		
		List<Map<String,String>> ListofMaps = new ArrayList<>();
		
	//create and add the first map to the list
			
			Map<String,String> map1 = new HashMap<>();
			map1.put("Name","Hevin");
			map1.put("age","20");
			map1.put("city","france");
		
			ListofMaps.add(map1);
			
	// create and add the second map 
	
			Map<String,String> map2 = new HashMap<>();
			map2.put("Name","Regan");
			map2.put("Age","25");
			map2.put("City","Tailand");
			
			ListofMaps.add(map2);
			
	// print the list
				System.out.println("List of maps: ");
			for(Map<String,String> map : ListofMaps){
			
			for(Map.Entry<String,String> entry : map.entrySet()){
				
				System.out.println(entry.getKey()+ " : " +entry.getValue());
			}
			System.out.println("-------");
		}
	}
	
//  get the Map and modify the value for the given key
	
	public static void ModifyMap(){
		
		Collection c14 = new Collection(); 
	//create map 
	
		Map<String,Integer> ageMap = new HashMap<>();
			ageMap.put("HEVIN",23);
			ageMap.put("REEGAN",22);
			ageMap.put("yosva",23);
   //print the map
		System.out.println("Ordinal map is : ");
		System.out.println(ageMap);
   //modify the map values key "REEGAN"
		if(ageMap.containsKey("REEGAN")){
			ageMap.put("REEGAN",30);
		}
		else {
			System.out.println("key not found ");
		}
		
	System.out.println("After modifying Map : ");
    System.out.println(ageMap);
	}	
//get the Map and delete the key and value in java with output

	public static void DeleteMap() {
	
		Collection c15 = new Collection();
	
	// create map 
		Map<String,String> map1 = new TreeMap<>();
		map1.put("duke","bike");
		map1.put("milk","cow");
		map1.put("mango","fruit");
		map1.put("tea","cup");
		
	//print the map
		System.out.println("Orginal map is : ");
		System.out.println(map1);
	//remove method in map
		if(map1.containsKey("tea")){
			map1.remove("tea");
			System.out.println("key tea and his value is removed");
		}
		else{
			System.out.println("key tea doesn't removed");
		}
		
		System.out.println("after removing map is : ");
		System.out.println(map1);
	}


// get the Map and delete that map from List through remove method of Iterator and List

		public static void RemoveMethodOfIterator(){
			
			Collection c16 = new Collection();
			
	//create List
			List<Map<String,String>> mapList = new ArrayList<>();
	//create map 		
			Map<String,String> map1 = new HashMap<>();
			
			map1.put("Name","Hevin");
			map1.put("age","15");
			mapList.add(map1);
	//create second map		
			Map<String,String> map2 = new HashMap<>();
			
			map2.put("Name","yosva");
			map2.put("Age","18");
			mapList.add(map2);
	//create third map		
			Map<String,String> map3 = new HashMap<>();
			
			map3.put("Name","Remo");
			map2.put("Age","18");
			mapList.add(map3);
			
	//Print statemant		
			System.out.println("Orginal map is : ");
		for( Map<String,String> map : mapList){
			System.out.println(map);
		}
		
	//create iterator
		Iterator<Map<String,String>> iterator = mapList.iterator();
	//remove map and print value using iterator
	while (iterator.hasNext()){
		Map<String,String> map = iterator.next();
		if("Remo".equals(map.get("Name"))){
			iterator.remove();
			System.out.println("Map containg removed the name of Remo");
		}
	}
			System.out.println("After remove the map :");
		for(Map<String,String> mapl:mapList)
		{
			System.out.println(mapl);
		}
			
	  
	}	
	
//  Make the List to store only String values

  public static void ListToStore(){
	  
	  Collection c17 = new Collection();
 //Create list in map	  
	  List<Map<String,String>> mapList = new ArrayList<>();
		
 //Create map 
	 Map<String,String> map0= new HashMap<>();
		 map0.put("Tree","coconut");
		 map0.put("Tom","Jerry");
		 map0.put("Dora","Buji");
		 mapList.add(map0);
	 Map<String,String> map1= new HashMap<>();
		 map1.put("Ac","Cool");
		 map1.put("cat","rabit");
		 mapList.add(map1);
		 
		 System.out.println("Orginal map is :");
		 System.out.println(mapList);
	 }
	
// check the existance of List of elements in the original List

    public static void existanceOfList(){
			
	 Collection c18 = new Collection();
	// create list
		List<String>myList = new ArrayList<>();
		myList.add("Friuts");
		myList.add("chaco");
		myList.add("Mobile");
		System.out.println("First List :");
		System.out.println(myList);
	// create another list
		List<String>myList1 = new ArrayList<>();
		myList1.add("Friuts");
		myList1.add("chaco");
		myList1.add("oppo");
		System.out.println("Second List: "+myList1);
	//found the element existance list to orginal list	
		System.out.println("found the orginal list :" );
		for( String element : myList1){
			if(myList.contains(element)){
				System.out.println(element);
			}
		}
		
	}

// inserting an element in the middle of a List
	public static void InsertElement(){	
	
		Collection c19 = new Collection();
	
		List<Integer>myList=new ArrayList<>();
			myList.add(12);
			myList.add(14);
			myList.add (15);
			myList.add(16);
			System.out.println("originalList: ");
			printList(myList);
			
	// inserting list
			myList.add(2,100);
			System.out.println("after inserting 100 at 2 of index: ");
			printList(myList);
}
	public static void printList(List<Integer> list) {
        for (Integer num : list) {
            System.out.println(num+"");
		}
		System.out.println("");
	}
	

    public static void ElementIndexes()  {
		
		Collection c20 = new Collection();
//list create 		
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(4);
        myList.add(2);
        myList.add(5);
        myList.add(6);

        int elementToFind = 2;

        System.out.println("Forward Indexes of element " + elementToFind + ":");
        findIndexes(myList, elementToFind, true);

        System.out.println("\nReverse Indexes of element " + elementToFind + ":");
        findIndexes(myList, elementToFind, false);
    }

    public static void findIndexes(List<Integer> list, int element, boolean forward) {
        if (forward) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == element) {
                    System.out.println("Index: " + i);
                }
            }
        } else {
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i) == element) {
                    System.out.println("Index: " + i);
                }
            }
        }
    } 
	
//create a new List from set of elements in the original List

 public static void ElementsList(){
	 Collection c21 = new Collection();
   List<Integer>myList=new ArrayList<>();
   //new list create
	   myList.add(20);
	   myList.add(30);
	   myList.add(40);
	   myList.add(50);
	   myList.add(60);
	   myList.add(70);
	   myList.add(80);
	//second list
	List<Integer>myList1= new ArrayList<>();
	   myList1.add(40);
	   myList1.add(80);
	   myList1.add(10);
  List<Integer> extractedList = extractElements(myList,myList1);
  System.out.println("ExtractedList: "+extractedList);
 }
	 public static <T> List<T> extractElements(List<T>myList,List<T>myList1){
		 List<T> extractedList= new ArrayList<>();
		 for(T element:myList){
			 if(myList1.contains(element)){
				 
				 extractedList.add(element);
			 }
			 
		 }
     return extractedList;
  }

// store duplicate and null values in the List and get the hash code of a List

	public static void HashCodeofList(){
		Collection c23 = new Collection();
		
		List<Integer> myList = new ArrayList<>();
		myList.add(20);
		myList.add(30);
		myList.add(null);
		myList.add(null);
		myList.add(101);
		myList.add(null)
		
		int hashCode = myList.hashCode();
		
		System.out.println("hash Code of the List: "+hashCode);
	}
}  
