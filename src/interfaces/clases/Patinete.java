package interfaces.clases;

import interfaces.interfaces.IVehiculo;

/**
 * 
 * @author Alexander Saiz
 *
 */

public class Patinete implements IVehiculo {

	int velocidadActual = 0;
	boolean isArrancado = false;

	@Override
	public void arrancar() {
		isArrancado = true;
	}

	@Override
	public void acelerar(int invrementoVel) {
		if (isArrancado = true && velocidadActual + invrementoVel <= VEL_MAX_PATINETE) {
			velocidadActual = velocidadActual + invrementoVel;
		}
	}

	@Override
	public void frenar(int decrementoVel) {
		if (isArrancado = true && velocidadActual - decrementoVel >= 0) {
			velocidadActual = velocidadActual - decrementoVel;
			if (velocidadActual < 0) {
				velocidadActual = 0;
			}
		}
	}

	@Override
	public void apagar() {
		if (velocidadActual == 0) {
			isArrancado = false;
		}

	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isArrancado() {
		return isArrancado;
	}

	public void setArrancado(boolean isArrancado) {
		this.isArrancado = isArrancado;
	}

	@Override
	public String toString() {
		if (isArrancado) {
			return "soy un patinete, estoy encendido y mi velocidad actual es de " + velocidadActual + " km/h";
		} else {
			return "soy un patinete, estoy apagado y mi velocidad actual es de " + velocidadActual + " km/h";
		}
	}
}
