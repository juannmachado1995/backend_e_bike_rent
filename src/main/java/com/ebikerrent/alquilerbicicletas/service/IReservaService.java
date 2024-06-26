package com.ebikerrent.alquilerbicicletas.service;

import com.ebikerrent.alquilerbicicletas.dto.entrada.modificacion.ReservaModificacionEntradaDto;
import com.ebikerrent.alquilerbicicletas.dto.entrada.reserva.ReservaEntradaDto;
import com.ebikerrent.alquilerbicicletas.dto.salida.reserva.ReservaSalidaDto;
import com.ebikerrent.alquilerbicicletas.exceptions.ResourceNotFoundException;

import java.util.List;

public interface IReservaService {
    List<ReservaSalidaDto> listarReservas();
    ReservaSalidaDto registrarReserva(ReservaEntradaDto reservaEntradaDto) throws ResourceNotFoundException;

    ReservaSalidaDto buscarReservaPorId(Long id) throws ResourceNotFoundException;

    void eliminarReserva(Long id) throws ResourceNotFoundException;

    ReservaSalidaDto modificarReserva (ReservaModificacionEntradaDto reservaModificacionEntradaDto) throws ResourceNotFoundException;

    public boolean buscarReservaPorProducto (ReservaEntradaDto reservaEntradaDto) throws ResourceNotFoundException;
    //List<ReservaSalidaDto> listarReservasPorUsuario(Long id) throws ResourceNotFoundException;// buscamos por id? o ReservaEntradaDto.


}
