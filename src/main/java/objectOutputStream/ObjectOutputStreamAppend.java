package objectOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

        class ObjectOutputStreamAppend {
            public static void main(String[] args) {
                String fileName = "objectStr";

                File file = new File(fileName);
                if (!file.exists()) {
                    System.out.println("File not found, creating new file");
                } else {
                    System.out.println("File founded");
                }


                List<String> objects = new ArrayList<>();
                objects.add("first");
                objects.add("second");
                objects.add("third");
                writeObjectsToFile(fileName, objects);

                List<String> newObjects = new ArrayList<>();
                newObjects.add("fourth");
                newObjects.add("fifth");
                appendObjectsToFile(fileName, newObjects);
            }

            private static void writeObjectsToFile(String fileName, List<String> objects) {
                try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                    for (String object : objects) {
                        objectOutputStream.writeObject(object);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ;
            }

            private static void appendObjectsToFile(String fileName, List<String> objects) {
                try (FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream) {
                         @Override
                         public void writeStreamHeader() throws IOException {
                         }
                     }) {
                    for (String object : objects) {
                        objectOutputStream.writeObject(object);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
