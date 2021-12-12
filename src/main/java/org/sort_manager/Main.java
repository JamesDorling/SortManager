package org.sort_manager;

import org.sort_manager.array_randomiser.ArrayRandomiser;
import org.sort_manager.input_handler.InputHandler;
import org.sort_manager.output_handler.Printer;

public class Main
{
    public static void main( String[] args )
    {
        Printer.printArrayData(SortFactory.getSorter(InputHandler.takeInputSortType(),
                ArrayRandomiser.generateRandomNumberList(InputHandler.takeInputListSize())));
    }
}
