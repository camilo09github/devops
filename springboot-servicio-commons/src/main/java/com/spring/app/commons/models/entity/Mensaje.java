package com.spring.app.commons.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mensajes")
public class Mensaje implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "mensaje")
	private String mensaje;
	
	@Column(name = "para")
	private String para;
	
	@Column(name = "desde")
	private String desde;
	
	@Column(name = "timetolifesec")
	@Temporal(TemporalType.DATE)
	private Date timetolifesec;
	
	@Transient
	private Integer port;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getPara() {
		return para;
	}
	public void setPara(String para) {
		this.para = para;
	}

	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}

	public String getDesde() {
		return desde;
	}
	public void setDesde(String desde) {
		this.desde = desde;
	}
	
	public Date getTimeTo() {
		return timetolifesec;
	}
	public void setTimeTo(Date timetolifesec) {
		this.timetolifesec = timetolifesec;
	}

	private static final long serialVersionUID = 1285454306356845809L;

}
