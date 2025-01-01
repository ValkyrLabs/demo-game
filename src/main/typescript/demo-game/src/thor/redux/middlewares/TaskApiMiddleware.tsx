
import { 
    getTask, 
    postTask,
    getTaskList , 
    deleteTask , 
    updateTask 
} from '../../api';

import {

    ADD_TASK_REQUEST,
    FETCH_TASK_REQUEST,
    LIST_TASK_REQUEST,
    UPDATE_TASK_REQUEST,
    DELETE_TASK_REQUEST,

    addTaskFailure,
    addTaskSuccess,

    fetchTaskFailure,
    fetchTaskSuccess,
    
    listTaskFailure,
    listTaskSuccess,

    updateTaskFailure,
    updateTaskSuccess,
    
    deleteTaskFailure,
    deleteTaskSuccess,
    
} from '../actions/TaskApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Task
*/

export const TaskMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Task MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_TASK_REQUEST:
            try {
                const response = postTask(action.payload);
                dispatch(addTaskSuccess(response.body));
            } catch (error) {
                dispatch(addTaskFailure(error.message));
            }
            break;

        case LIST_TASK_REQUEST:
            try {
                const response = getTaskList();
                dispatch(listTaskSuccess(response.body));
            } catch (error) {
                dispatch(listTaskFailure(error.message));
            }
            break;


        case FETCH_TASK_REQUEST:
            try {
                const response = getTask(action.id);
                dispatch(fetchTaskSuccess(response.body));
            } catch (error) {
                dispatch(fetchTaskFailure(error.message));
            }
            break;

        case UPDATE_TASK_REQUEST:
            try {
                const { id, Task } = action.payload;
                const response = updateTask(id);
                dispatch(updateTaskSuccess(response.body));
            } catch (error) {
                dispatch(updateTaskFailure(error.message));
            }
            break;

        case DELETE_TASK_REQUEST:
            try {
                const { id, Task } = action.payload;
                const response = deleteTask(id);
                dispatch(deleteTaskSuccess(response.body));
            } catch (error) {
                dispatch(deleteTaskFailure(error.message));
            }
            break;

        default:
            break;
    }
};
