package oops;


 class hybrid_parent {
	void parent () {
		System.out.println("Parent");
	}

}

class hybrid_child1 extends hybrid_parent{
	void child1 (){
		System.out.println("child1");
	}
}

class hybrid_child2 extends hybrid_parent{
	void child2 () {
		System.out.println("child2");
	}
}

class hybrid_subchild extends hybrid_child2 {
	void subchild () {
		System.out.println("subchild");
	}
}





class hybridclass{
	public static void main(String[] args) {
		hybrid_subchild o=new hybrid_subchild();
		o.subchild();
		o.child2();
		o.parent();
		
		hybrid_child1 ob=new hybrid_child1();
		ob.child1();
		
		
	}
}