class SequenceSearch implements MySearchable {
	int array[];
    int index;
	SequenceSearch() {
		this.array = new int[32];
        this.index = 0;
	}
	
	public void put(int item) {
        this.array[index] = item;    
        this.index++;
    }
	
	public boolean exist(int item) {
        int flag = 0;
		for (int i = 0; i < 32; i++) {
            if (this.array[i] == item) {
                flag = 1;
                break;
            }
            else continue;
        }

        if (flag == 1) return true;
        else return false;
    }
}


