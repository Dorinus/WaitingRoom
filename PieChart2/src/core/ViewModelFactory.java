package core;

import view.piechart.PieChartViewModel;
import view.textchart.TextViewModel;

public class ViewModelFactory {

    private PieChartViewModel pieChartViewModel;
    private TextViewModel textViewModel;
    private ModelFactory modelFactory;

    public ViewModelFactory(ModelFactory modelFactory) {
        this.modelFactory = modelFactory;
        pieChartViewModel = new PieChartViewModel(modelFactory.getDataModel());
    }

    public PieChartViewModel getPieChartViewModel() {
        return pieChartViewModel;
    }

    public TextViewModel getTextViewModel()
    {
        if(textViewModel == null) textViewModel = new TextViewModel(modelFactory.getDataModel());
        return textViewModel;
    }
}
