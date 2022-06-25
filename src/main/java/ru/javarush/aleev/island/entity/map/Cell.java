package ru.javarush.aleev.island.entity.map;

public class Cell {

    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

//    private final Map<String, Set<Organism>> residents = new HashMap<>() {
//        private void checkNull(Object key) {
//            this.putIfAbsent(key.toString(), new HashSet<>());
//        }
//
//        @Override
//        public Set<Organism> get(Object key) {
//            checkNull(key);
//            return super.get(key);
//        }
//
//        @Override
//        public Set<Organism> put(String key, Set<Organism> value) {
//            checkNull(key);
//            return super.put(key, value);
//        }
//    };

//    @Override
//    public String toString() {
//        return getResidents().values().stream()
//                .filter((list) -> list.size() > 0)
//                .sorted((o1, o2) -> o2.size() - o1.size())
//                .map(set -> set.stream().findAny().get().getLetter())
//                .map(Object::toString)
//                .collect(Collectors.joining());
//    }
}
