
import { 
    getChart, 
    postChart,
    getChartList , 
    deleteChart , 
    updateChart 
} from '../../api';

import {

    ADD_CHART_REQUEST,
    FETCH_CHART_REQUEST,
    LIST_CHART_REQUEST,
    UPDATE_CHART_REQUEST,
    DELETE_CHART_REQUEST,

    addChartFailure,
    addChartSuccess,

    fetchChartFailure,
    fetchChartSuccess,
    
    listChartFailure,
    listChartSuccess,

    updateChartFailure,
    updateChartSuccess,
    
    deleteChartFailure,
    deleteChartSuccess,
    
} from '../actions/ChartApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Chart
*/

export const ChartMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Chart MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_CHART_REQUEST:
            try {
                const response = postChart(action.payload);
                dispatch(addChartSuccess(response.body));
            } catch (error) {
                dispatch(addChartFailure(error.message));
            }
            break;

        case LIST_CHART_REQUEST:
            try {
                const response = getChartList();
                dispatch(listChartSuccess(response.body));
            } catch (error) {
                dispatch(listChartFailure(error.message));
            }
            break;


        case FETCH_CHART_REQUEST:
            try {
                const response = getChart(action.id);
                dispatch(fetchChartSuccess(response.body));
            } catch (error) {
                dispatch(fetchChartFailure(error.message));
            }
            break;

        case UPDATE_CHART_REQUEST:
            try {
                const { id, Chart } = action.payload;
                const response = updateChart(id);
                dispatch(updateChartSuccess(response.body));
            } catch (error) {
                dispatch(updateChartFailure(error.message));
            }
            break;

        case DELETE_CHART_REQUEST:
            try {
                const { id, Chart } = action.payload;
                const response = deleteChart(id);
                dispatch(deleteChartSuccess(response.body));
            } catch (error) {
                dispatch(deleteChartFailure(error.message));
            }
            break;

        default:
            break;
    }
};

