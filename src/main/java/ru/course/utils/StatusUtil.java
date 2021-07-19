package ru.course.utils;

import ru.course.model.Status;

public class StatusUtil {

    static int SUCCESS_STATUS_CODE = 1;
    private static int FAILED_STATUS_CODE = -1;
    private static String SUCCESS_DESCRIPTION = "Успешное выполнение заявки";
    private static String FAILED_DESCRIPTION = "Заявка не выполнена";

    public static Status createSuccessStatus(){
        Status status = new Status();
        status.setCode(SUCCESS_STATUS_CODE);
        status.setDescription(SUCCESS_DESCRIPTION);
        return status;
    }

    public static Status createFailedStatus(){
        Status status = new Status();
        status.setCode(FAILED_STATUS_CODE);
        status.setDescription(FAILED_DESCRIPTION);
        return status;
    }
}
