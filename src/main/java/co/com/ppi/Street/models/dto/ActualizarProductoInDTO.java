/**
 * 
 */
package co.com.ppi.Street.models.dto;

import java.util.List;

/**
 * TODO: descripción <br>
 * Creado el Oct 8, 2022 a las 8:23:16 AM <br>
 *
 */
public class ActualizarProductoInDTO {

	private String nombre;

	private String descripcion;

	private Double precio;

	private Long idTipoSubcategoriaProducto;

	List<DetalleProductoInDTO> listaDetallesProducto;

	List<ImagenProductoInDTO> imagenesProducto;
	
	private String activo;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the idTipoSubcategoriaProducto
	 */
	public Long getIdTipoSubcategoriaProducto() {
		return idTipoSubcategoriaProducto;
	}

	/**
	 * @param idTipoSubcategoriaProducto the idTipoSubcategoriaProducto to set
	 */
	public void setIdTipoSubcategoriaProducto(Long idTipoSubcategoriaProducto) {
		this.idTipoSubcategoriaProducto = idTipoSubcategoriaProducto;
	}

	/**
	 * @return the listaDetallesProducto
	 */
	public List<DetalleProductoInDTO> getListaDetallesProducto() {
		return listaDetallesProducto;
	}

	/**
	 * @param listaDetallesProducto the listaDetallesProducto to set
	 */
	public void setListaDetallesProducto(List<DetalleProductoInDTO> listaDetallesProducto) {
		this.listaDetallesProducto = listaDetallesProducto;
	}

	/**
	 * @return the imagenesProducto
	 */
	public List<ImagenProductoInDTO> getImagenesProducto() {
		return imagenesProducto;
	}

	/**
	 * @param imagenesProducto the imagenesProducto to set
	 */
	public void setImagenesProducto(List<ImagenProductoInDTO> imagenesProducto) {
		this.imagenesProducto = imagenesProducto;
	}

	/**
	 * @return the activo
	 */
	public String getActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(String activo) {
		this.activo = activo;
	}
	
}
