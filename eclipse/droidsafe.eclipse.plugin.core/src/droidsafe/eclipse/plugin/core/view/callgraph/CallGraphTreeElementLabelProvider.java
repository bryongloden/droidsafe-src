package droidsafe.eclipse.plugin.core.view.callgraph;

import java.util.List;

import org.eclipse.swt.graphics.Image;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import droidsafe.eclipse.plugin.core.specmodel.TreeElement;
import droidsafe.eclipse.plugin.core.util.DroidsafePluginUtilities;
import droidsafe.eclipse.plugin.core.view.DroidsafeInfoTreeElementLabelProvider;
import droidsafe.eclipse.plugin.core.view.indicator.Utils;
import droidsafe.speclang.model.MethodModel;
import droidsafe.speclang.model.SecuritySpecModel;

public class CallGraphTreeElementLabelProvider extends DroidsafeInfoTreeElementLabelProvider {
    /**
     * Returns the label for the tree node to display in the tree outline view.
     * 
     * @param element The element to display in the tree node.
     * @return The text for the node label.
     */
    @Override
    public String getText(Object element) {
    	if (element instanceof TreeElement<?, ?>) {
    		TreeElement<?, ?> treeElement = (TreeElement<?, ?>) element;
    		Object data = treeElement.getData();
    		if (data instanceof JsonObject) {
    			JsonObject jsonObj = (JsonObject) data;
    			String sig = Utils.getFieldValueAsString(jsonObj, "signature");
    			if (sig != null) {
    				sig = sig.substring(1, sig.length() - 1);
    				return sig;
    			}
    			return DroidsafePluginUtilities.removeCloneSuffix(data.toString());
    		}
    	}
    	return DroidsafePluginUtilities.removeCloneSuffix(element.toString());
    }

    public String getToolTipText(Object element) {
        if (element instanceof TreeElement<?, ?>) {
            TreeElement<?, ?> treeElement = (TreeElement<?, ?>) element;
            Object data = treeElement.getData();
            if (data instanceof JsonObject) {
                List<MethodModel> methods = Utils.getMethodModels((JsonObject) data);
                if (methods.size() > 1)
                	return methods.size() + " contexts";
            }
        }
        return null;
      }

    /**
     * Returns the icon image for the tree node.
     * 
     * @param element The tree node element to display.
     * @return The icon image to display together with the label in the outline view.
     */
    public Image getImage(Object element) {
        return null;
    }

    
}
