import java.util.NoSuchElementException;
 

public class celllist {

	private class cellnode {
 		private cellphone k;
		private cellnode next;

		public cellnode() {
			k = null;
			next = null;
		}

		public cellnode(cellphone data, cellnode next) {
			k = data;
			this.next = next;
		}
		public cellphone getcel(){
			return k;
		}
	}// inner class finished

	private cellnode head;
	private int size;

	public celllist() {
		head = null;
		size = 0;
	}

	public celllist(celllist o)   {

		if (o == null)
			throw new NullPointerException("is null cant copy,system end");
		if (o.head == null) {
			head = null;
			size = 0;
		} else {
			cellnode copy = o.head;

			for (int i = 0; i < o.size; i++)
			{
				if (copy != null)
				{
					add(copy.k);
					copy = copy.next;
				}
			}
  		}
	}

	public celllist clone( )
  {
		  try
		  {
			  celllist copy =
					  (celllist)super.clone( );
			  if (head == null)
				  copy.head = null;
			  else
			  copy.head = copyOf(head);
			  return copy;
			  }
		  catch(CloneNotSupportedException e)
		  {//This should not happen.
			  return null; //To keep the compiler happy.
			  }
		  }
	private cellnode copyOf(cellnode next) {

		cellnode position = next;
		cellnode newone;
		cellnode end = null;

		newone = new cellnode((cellphone) (position.k).clone(), null);
		end = newone;
		position=position.next;
		while (position != null) {
			end.next = new cellnode((cellphone) (position.k).clone(), null);
			end = end.next;
			position = position.next;
		}

		return newone;
	}

	public void addtostart(cellphone data) {
		head = new cellnode(data, head);
		 size++;
	}



	public void insertatindex(cellphone data, int index) {
		if(index<0||index>=size-1) {
			throw new NoSuchElementException("wrong index,system ended ---from insertatindex method ");
		}
		else {
			if (index == 0) {
				addtostart(data);
				size ++;
			}
			cellnode before = nodeAtIndex(index-1);
			cellnode on     = new cellnode(data, before.next);
			before.next=on;
			size ++;
 		}

	}

	public void deletefromindex(int index) {
		if ((index < 0 || index >= size)) {
			throw new NoSuchElementException("no such elements,index invalid.System ended.----from deletefromindex method");
		} else {

			// Checks if there are any elements to delete
			if (size == 0) {
				System.out.println("Error: the list is of size 0, can't delete element.");
			}

			// Get the node right before the one at the index
			cellnode nodeBeforeIndex = nodeAtIndex(index - 1);

			// Skip the next node and go to the one after; assign it to that previous node
			nodeBeforeIndex.next = nodeBeforeIndex.next.next;
			size--;

			// Preventing privacy leaks
			nodeBeforeIndex = null;
			return;

		}
	}

	public void deleteFromStart() {
		if (size > 1) {
			head = head.next;
			size--;
		} else if (size == 1) {
			head = null;
			size = 0;
		} else {
			System.out.println("No more elements to delete");
		}
	}

	public void replaceatindex(cellphone k, int t) {

			if (t > 0 && t <= size - 1) {
				cellnode nodeBeforeIndex = nodeAtIndex(t - 1);
				nodeBeforeIndex.next = new cellnode(k, nodeBeforeIndex.next.next);
			}
			if (size == 0) {
				head = new cellnode(k, null);
			} else {
				return;

			}

	}

	public cellnode find(long serial) {
		cellnode pointer = head;
		int times = 1;
		while (pointer != null) {
			 System.out.println("Number # " + times + " iterations.");
			if (pointer.k.getSerialnum() == serial) {
				return pointer;
			} else {
				pointer = pointer.next;
				times = times + 1;
			}
		}
		// if it goes to the end but still didn't find it it will return null
		// some error
		return null;

	}


	public boolean contains(long serial) {
		cellnode pointer = head;
		int times = 1;
		while (pointer != null) {
			System.out.println("Number # " + times + " iterations.");
			if (pointer.k.getSerialnum() == serial) {
				return true;
			} else {
				pointer = pointer.next;
				times = times + 1;
			}
		}
		// if it goes to the end but still didn't find it it will return null
		// some error

		return false;
	}

	public void showcontents() {
		System.out.println("The current size of the list is " + this.size + ". Here are the contents of the list");
		System.out.println("=================================================================================");
		int nofitem = 0;

		if (head == null)
			System.out.println("no linklist being initiated or head point to null,nothing to print");
		else{
			cellnode temp = head;
 			while (temp != null) {
				System.out.print(temp.k);
				temp = temp.next;
				nofitem++;
				if(nofitem%3==0)
					System.out.print("\n");
			}
			if (nofitem > 0) {
				System.out.print("X");
			}
		}


	}

	public boolean equals(Object o) {
		if (o==null)
		{
			return false;
		}

		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		else{
			celllist temp = (celllist) o;
			if (size != temp.size )
				 return false;
			cellnode position = head;
			cellnode otherPosition = temp.head;

			while (position != null)
			{
				if (!(position.k.equals(otherPosition.k)))
					return false;
				position = position.next;
				otherPosition = otherPosition.next;
			}
			return true; //no mismatch was not found
		}
	}
 public boolean checksameexcepSerial(celllist k) {
	 cellnode a =this.head;//point to its own head
	 cellnode b =k.head;//point to k's own head
	 while (a != null && b != null)
     {
         if (!a.equals(b))
             return false;
         /* If we reach here, then a and b are not null
            and their data is same, so move to next nodes
            in both lists */
         a = a.next;
         b = b.next;
     }
     // If linked lists are identical, then 'a' and 'b' must
     // be null at this point.
     return (a == null && b == null);
		}

 public void add(cellphone cellPhone) {
		if (size != 0)
		{
			// Adding cellPhone at the end
 			cellnode temp = nodeAtIndex(size - 1 );
			temp.next = new cellnode(cellPhone, null);
			size++;
			System.out.println("======add to nail ");

		}
		else
		{
			addtostart(cellPhone);
			System.out.println("======add to start ");

		}
	}
 
	private cellnode nodeAtIndex(int indexToCheck) {
		try {
			// Check if it's a valid index
			if ((indexToCheck < 0 || indexToCheck >= size)) {
				throw new NoSuchElementException();
			} else {
				// Return the node at the specified index
				cellnode node = head;
				for (int i = 0; i < indexToCheck; i++) {
					if (node != null) {
						node = node.next;
					} else {
						throw new NullPointerException();
					}
				}

				return node;
			}
		} catch (NoSuchElementException e) {
			System.out.println("Error: index inputted in the wrong range.");
			System.exit(0);
		}

		return null;
	}
	public void getindexprint(cellnode d){
		try{
			System.out.println(d.k);
		}catch(NullPointerException e){
			System.out.println("didn't find it ,bye bye");
		}


	}

 
 
}
