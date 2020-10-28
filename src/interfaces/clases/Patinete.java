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

		if (!this.isArrancado) {
			this.isArrancado = true;
		}
	}

	@Override
	public void acelerar(int invrementoVel) {
		if (this.isArrancado && this.velocidadActual + invrementoVel <= VEL_MAX_PATINETE) {
			this.velocidadActual = this.velocidadActual + invrementoVel;
		} else {
			this.velocidadActual = VEL_MAX_PATINETE;
		}
	}

	@Override
	public void frenar(int decrementoVel) {
		if (this.isArrancado && this.velocidadActual - decrementoVel >= 0) {
			this.velocidadActual = this.velocidadActual - decrementoVel;
			if (this.velocidadActual < 0) {
				this.velocidadActual = 0;
			}
		}
	}

	@Override
	public void apagar() throws Exception {
		if (this.velocidadActual > 0 && this.isArrancado) {
			throw new Exception("no se puede apagar estando acelerando");
		} else {
			this.isArrancado = false;
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
