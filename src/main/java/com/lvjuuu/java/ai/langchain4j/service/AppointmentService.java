package com.lvjuuu.java.ai.langchain4j.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lvjuuu.java.ai.langchain4j.entity.Appointment;

/**
 * @author lyj20$
 * @date 2025/5/13$ 22:29$
 */
public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
