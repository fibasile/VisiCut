/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MappingDialog.java
 *
 * Created on 24.08.2011, 11:44:29
 */
package com.t_oster.visicut.gui;

import com.kitfox.svg.SVGRoot;
import com.t_oster.visicut.model.VectorProfile;
import com.t_oster.visicut.model.MaterialProfile;
import com.t_oster.visicut.model.graphicelements.GraphicObject;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author thommy
 */
public class MappingDialog extends javax.swing.JDialog {

    public MappingDialog()
    {
        this(null, true);
    }
    
    /** Creates new form MappingDialog */
    public MappingDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

    buttonGroup1 = new javax.swing.ButtonGroup();
    matchingPartsPanel1 = new com.t_oster.visicut.gui.mappingdialog.MatchingPartsPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    cuttingProfilesPanel1 = new com.t_oster.visicut.gui.mappingdialog.CuttingProfilesPanel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    sVGElementsTree1 = new com.t_oster.visicut.gui.mappingdialog.MappingJTree();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setName("Form"); // NOI18N

    org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.t_oster.visicut.gui.VisicutApp.class).getContext().getResourceMap(MappingDialog.class);
    matchingPartsPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("matchingPartsPanel1.border.title"))); // NOI18N
    matchingPartsPanel1.setName("matchingPartsPanel1"); // NOI18N

    org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, sVGElementsTree1, org.jdesktop.beansbinding.ELProperty.create("${matchingElements}"), matchingPartsPanel1, org.jdesktop.beansbinding.BeanProperty.create("graphicElements"), "MatchingElementsToPanel");
    bindingGroup.addBinding(binding);
    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${selectedLineType}"), matchingPartsPanel1, org.jdesktop.beansbinding.BeanProperty.create("lineType"), "LineTypeToPanel");
    bindingGroup.addBinding(binding);
    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${material}"), matchingPartsPanel1, org.jdesktop.beansbinding.BeanProperty.create("material"), "MaterialToPanel");
    bindingGroup.addBinding(binding);

    javax.swing.GroupLayout matchingPartsPanel1Layout = new javax.swing.GroupLayout(matchingPartsPanel1);
    matchingPartsPanel1.setLayout(matchingPartsPanel1Layout);
    matchingPartsPanel1Layout.setHorizontalGroup(
      matchingPartsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 382, Short.MAX_VALUE)
    );
    matchingPartsPanel1Layout.setVerticalGroup(
      matchingPartsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 375, Short.MAX_VALUE)
    );

    jScrollPane2.setName("jScrollPane2"); // NOI18N

    cuttingProfilesPanel1.setName("cuttingProfilesPanel1"); // NOI18N

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${material}"), cuttingProfilesPanel1, org.jdesktop.beansbinding.BeanProperty.create("material"), "MaterialToProfilesPanel");
    bindingGroup.addBinding(binding);
    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${selectedLineType}"), cuttingProfilesPanel1, org.jdesktop.beansbinding.BeanProperty.create("selectedCuttingProfile"), "LineTypeFormToCuttingPanelAndBack");
    bindingGroup.addBinding(binding);

    javax.swing.GroupLayout cuttingProfilesPanel1Layout = new javax.swing.GroupLayout(cuttingProfilesPanel1);
    cuttingProfilesPanel1.setLayout(cuttingProfilesPanel1Layout);
    cuttingProfilesPanel1Layout.setHorizontalGroup(
      cuttingProfilesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 214, Short.MAX_VALUE)
    );
    cuttingProfilesPanel1Layout.setVerticalGroup(
      cuttingProfilesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 350, Short.MAX_VALUE)
    );

    jScrollPane2.setViewportView(cuttingProfilesPanel1);

    jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
    jButton1.setName("jButton1"); // NOI18N
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
    jButton2.setName("jButton2"); // NOI18N

    jScrollPane1.setName("jScrollPane1"); // NOI18N

    sVGElementsTree1.setName("sVGElementsTree1"); // NOI18N

    binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${graphicElements}"), sVGElementsTree1, org.jdesktop.beansbinding.BeanProperty.create("graphicObjects"), "GraphicObjectsFormToTree");
    bindingGroup.addBinding(binding);

    jScrollPane1.setViewportView(sVGElementsTree1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(matchingPartsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jButton2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1))
          .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1)
          .addComponent(jButton2))
        .addContainerGap())
      .addComponent(matchingPartsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
    );

    bindingGroup.bind();

    pack();
  }// </editor-fold>//GEN-END:initComponents
  protected VectorProfile selectedLineType = null;
  public static final String PROP_SELECTEDLINETYPE = "selectedLineType";
  public static final String PROP_MATERIAL = "material";
  protected MaterialProfile material = null;
  
  /**
   * Get the value of material
   *
   * @return the value of material
   */
  public MaterialProfile getMaterial()
  {
    return material;
  }

  /**
   * Set the value of material
   *
   * @param material new value of material
   */
  public void setMaterial(MaterialProfile material)
  {
    MaterialProfile oldMaterial = this.material;
    this.material = material;
    propertyChangeSupport.firePropertyChange(PROP_MATERIAL, oldMaterial, material);
  }

  /**
   * Get the value of selectedLineType
   *
   * @return the value of selectedLineType
   */
  public VectorProfile getSelectedLineType()
  {
    return selectedLineType;
  }

  /**
   * Set the value of selectedLineType
   *
   * @param selectedLineType new value of selectedLineType
   */
  public void setSelectedLineType(VectorProfile selectedLineType)
  {
    VectorProfile oldSelectedLineType = this.selectedLineType;
    this.selectedLineType = selectedLineType;
    propertyChangeSupport.firePropertyChange(PROP_SELECTEDLINETYPE, oldSelectedLineType, selectedLineType);
  }
  private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

  /**
   * Add PropertyChangeListener.
   *
   * @param listener
   */
  @Override
  public void addPropertyChangeListener(PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  /**
   * Remove PropertyChangeListener.
   *
   * @param listener
   */
  @Override
  public void removePropertyChangeListener(PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }
  protected List<GraphicObject> graphicElements = new LinkedList<GraphicObject>();
  public static final String PROP_GRAPHICELEMENTS = "graphicElements";

  /**
   * Get the value of graphicElements
   *
   * @return the value of graphicElements
   */
  public List<GraphicObject> getGraphicElements()
  {
    return graphicElements;
  }

  /**
   * Set the value of graphicElements
   *
   * @param graphicElements new value of graphicElements
   */
  public void setGraphicElements(List<GraphicObject> graphicElements)
  {
    List<GraphicObject> oldGraphicElements = this.graphicElements;
    this.graphicElements = graphicElements;
    propertyChangeSupport.firePropertyChange(PROP_GRAPHICELEMENTS, oldGraphicElements, graphicElements);
  }

  /**
   * Get the value of SVGRootElement
   *
   * @return the value of SVGRootElement
   */
  public SVGRoot getSVGRootElement()
  {
    return null;
  }

  /**
   * Set the value of SVGRootElement
   *
   * @param SVGRootElement new value of SVGRootElement
   */
  public void setSVGRootElement(SVGRoot SVGRootElement)
  {
    //
  }

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private com.t_oster.visicut.gui.mappingdialog.CuttingProfilesPanel cuttingProfilesPanel1;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private com.t_oster.visicut.gui.mappingdialog.MatchingPartsPanel matchingPartsPanel1;
  private com.t_oster.visicut.gui.mappingdialog.MappingJTree sVGElementsTree1;
  private org.jdesktop.beansbinding.BindingGroup bindingGroup;
  // End of variables declaration//GEN-END:variables
}
