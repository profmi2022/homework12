package Transport;
import Bus.Bus;
import java.util.ArrayDeque;
import java.util.Queue;
import Exception.DiagnosticException;
public class ServiceStation {

    private final Queue<Transport> vehicleList = new ArrayDeque<>();    //Реализована очередь из авто

    public void addVehicle(Transport vehicle) {     //Добавляет авто в очередь
        if (vehicle instanceof Bus) {
            System.out.println("Автобусы не нуждаются в техобслуживании");
        } else {
            vehicleList.offer(vehicle);
        }
    }
    public void doInspection(){            //Обрабатывает очередь, запускает техобслуживание для каждого авто в очереди
        Transport vehicle = vehicleList.poll();
        if(vehicle != null){
            try {
            vehicle.doDiagnostic();
            } catch (DiagnosticException e){    //ловит исключения в диагностике
                System.out.println("Ошибка тех. обслуживания" + vehicle);
            }
            doInspection();
        }
    }
}
