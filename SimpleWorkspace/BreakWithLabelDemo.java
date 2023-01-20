Class BreakWithLabelDemo {
	public static void main(String[] args){
		
		int intNumbers = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		search:
		for(int i = 0; i < intNumbers.length){
			for(int j = 0; j < intNumbers[i].length; j++){
				if(intNumbers[i][j] == 5){
					break search;
				}
			}
		}

	}
}