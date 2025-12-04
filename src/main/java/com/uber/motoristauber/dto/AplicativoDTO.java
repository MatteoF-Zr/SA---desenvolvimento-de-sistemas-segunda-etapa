package com.uber.motoristauber.dto;

import java.math.BigDecimal;

public class AplicativoDTO {
    private Integer idAplicativo;
    private String nom_aplicativo;
    private BigDecimal tax_plataforma;
    private String ema_suporte;
    private BigDecimal tax_cancelamento;

    public Integer getIdAplicativo() { return idAplicativo; }
    public void setIdAplicativo(Integer idAplicativo) { this.idAplicativo = idAplicativo; }

    public String getNom_aplicativo() { return nom_aplicativo; }
    public void setNom_aplicativo(String nom_aplicativo) { this.nom_aplicativo = nom_aplicativo; }

    public BigDecimal getTax_plataforma() { return tax_plataforma; }
    public void setTax_plataforma(BigDecimal tax_plataforma) { this.tax_plataforma = tax_plataforma; }

    public String getEma_suporte() { return ema_suporte; }
    public void setEma_suporte(String ema_suporte) { this.ema_suporte = ema_suporte; }

    public BigDecimal getTax_cancelamento() { return tax_cancelamento; }
    public void setTax_cancelamento(BigDecimal tax_cancelamento) { this.tax_cancelamento = tax_cancelamento; }
}