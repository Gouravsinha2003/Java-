class StockData{
    public static void main(String[] args) {
      int[][]stockArray={{9, 11, 13, 15},{100, 120, 130, 110},{90, 80, 70, 60}};
      System.out.println("Stock values at different time intervals:");
      for(int i=0;i<stockArray[0].length;i++){
        System.out.println("Time: "+stockArray[0][i]);
        for(int j=1;j<stockArray.length;j++){
          System.out.println("Stock "+j+" value: "+stockArray[j][i]);
        }
        System.out.println();
      }
    }
  }
  