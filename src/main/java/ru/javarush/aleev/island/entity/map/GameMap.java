package ru.javarush.aleev.island.entity.map;



public class GameMap {

    public static Cell[][] cells = new Cell[5][5];

    //создаем поле
    public void fill(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j]=new Cell();
            }
        }
    }

//    public void setLive(){
//        for (int i = 0; i < cells.length; i++) {
//            for (int j = 0; j < cells[0].length; j++) {
//
//            }
//        }
//    }

    // вывод на экран карты
public void print(){
    for (int i = 0; i < cells.length; i++) {
        for (int j = 0; j < cells[i].length; j++) {
            System.out.print(cells[i][j]);
        }
        System.out.println();
    }
}

//    private final Cell[][] cells;
//
//    public GameMap(int rows, int cols){
//        cells=new Cell[rows][cols];
//    }
//
//    public Cell[][] getCells() {
//        return cells;
//    }
//
//    public int getRows(){
//        return cells.length;
//    }
//
//    public int getCols(){
//        return cells[0].length;
//    }

//    public Set<Organism> getAll(){
//        Set<Organism> all = new HashSet<>();
//        for(Cell[] row : cells){
//            for(Cell cell:row){
//                all.addAll(cell.getResidents().values().stream().flatMap(Collection::stream).collect(Collectors.toSet()));
//            }
//        }
//        return all;
//    }
}
