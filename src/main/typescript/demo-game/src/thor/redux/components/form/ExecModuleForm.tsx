import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { ExecModule, ExecModuleRoleEnum, ExecModuleModuleTypeEnum, ExecModuleStatusEnum,  } from '../../../model';
import { useAddExecModuleMutation } from '../../services/ExecModuleService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2025-01-03T16:22:47.869548-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: ExecModule
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const RoleValidation = () => { 
  return(
    [
      'anonymous', 'user', 'admin', 
    ]
  )
};

const ModuleTypeValidation = () => { 
  return(
    [
      'broadcast', 'io', 'reader', 'writer', 'transformer', 
    ]
  )
};

const StatusValidation = () => { 
  return(
    [
      'running', 'stopped', 'ready', 'good', 'warning', 'error', 'disabled', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     systemId: Yup.string()
    
    
    
    
    ,
     taskId: Yup.string()
    
    
    
    
    ,
     role: Yup.string().oneOf(RoleValidation(), 'Invalid value selected for role')
    
    
    
    
    ,
     name: Yup.string()
    
    
    
    
    ,
     notes: Yup.string()
    
    
    
    
    ,
         className: Yup.string()
    
    
    
    
    ,
     moduleType: Yup.string().oneOf(ModuleTypeValidation(), 'Invalid value selected for moduleType')
    
    
    
    
    ,
     moduleData: Yup.string()
    
    
    
    
    ,
     status: Yup.string().oneOf(StatusValidation(), 'Invalid value selected for status')
    
    
    
    
    ,
     id: Yup.string()
    
    
    
    
    ,
     ownerId: Yup.string()
    
    
    
    
    ,
     createdDate: Yup.date()
    
    
    
    
    ,
     keyHash: Yup.string()
    
    
    
    
    ,
     lastAccessedById: Yup.string()
    
    
    
    
    ,
     lastAccessedDate: Yup.date()
    
    
    
    
    ,
     lastModifiedById: Yup.string()
    
    
    
    
    ,
     lastModifiedDate: Yup.date()
    
    
    
    
    ,

});

const ExecModuleForm: React.FC = () => {
  const [addExecModule, addExecModuleResult] = useAddExecModuleMutation();

  const initialValues: ExecModule = {
    
    
    systemId : 'null',
    
    
    
    
    
    
    
    taskId : 'null',
    
    
    
    
    
        role :   ExecModuleRoleEnum[Object.keys(ExecModuleRoleEnum)[0]], 
    
    
    name : 'EmailSendModule, OpenApiSpecImportModule',
    
    
    
    
    
    
    
    notes : 'null',
    
    
    
    
    
    
    
    className : 'EmailModule, PipelineModule, RestApiModule',
    
    
    
    
    
        moduleType :   ExecModuleModuleTypeEnum[Object.keys(ExecModuleModuleTypeEnum)[0]], 
    
    
    moduleData : 'null',
    
    
    
    
    
        status :   ExecModuleStatusEnum[Object.keys(ExecModuleStatusEnum)[0]], 
    
    
    id : '21019af6-6e83-4148-b290-0fe61e5d1e30',
    
    
    
    
    
    
    
    ownerId : '0ae05055-3e5a-43ce-92b2-6e8e1595f7ae',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : 'ba9273f4-5fad-45f6-9430-15bcdd7794f7',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : '6be1f028-58a4-496e-a9ff-67964eb7dc6a',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<ExecModule>) => {
    setTimeout(() => {
      console.log(values);
      addExecModule(values);
      setSubmitting(false);
    }, 500);
  }

  return (
    <div>
      <Formik
        validateOnBlur={true}
        initialValues={initialValues}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >

        {({ isSubmitting, isValid, errors, setFieldValue, touched, setFieldTouched, handleSubmit }) => (
          <form onSubmit={handleSubmit} className="form">

                    <Accordion
                      defaultActiveKey="1"
                    >
                      <Accordion.Item eventKey="0">
                        <Accordion.Header><FaCogs size={36}/></Accordion.Header>
                        <Accordion.Body>
                          errors: {JSON.stringify(errors)}
                          <br />
                          touched: {JSON.stringify(touched)}
                          <br />
                          addExecModuleResult: {JSON.stringify(addExecModuleResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New ExecModule</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="systemId" className="nice-form-control">
              <b>System Id: {touched.systemId && !errors.systemId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* systemId  TEXT FIELD */}
              <Field name="systemId" type="text"
                className={errors.systemId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="systemId" component="span" />
            </label>


        
            <label htmlFor="taskId" className="nice-form-control">
              <b>Task Id: {touched.taskId && !errors.taskId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* taskId  TEXT FIELD */}
              <Field name="taskId" type="text"
                className={errors.taskId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="taskId" component="span" />
            </label>


        
            <label htmlFor="role" className="nice-form-control">
              <b>Role: {touched.role && !errors.role && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="role"
                className={errors.role ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('role', true);
                  setFieldValue('role', e.target.value);
                }}
              >
                <option value="" label="Select Role" />
                <RoleLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="role" component="span" />
            </label>


        
            <label htmlFor="name" className="nice-form-control">
              <b>Name: {touched.name && !errors.name && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* name  TEXT FIELD */}
              <Field name="name" type="text"
                className={errors.name  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="name" component="span" />
            </label>


        
            <label htmlFor="notes" className="nice-form-control">
              <b>Notes: {touched.notes && !errors.notes && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* notes  TEXT FIELD */}
              <Field name="notes" type="text"
                className={errors.notes  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="notes" component="span" />
            </label>


        
            <label htmlFor="className" className="nice-form-control">
              <b>Class Name: {touched.className && !errors.className && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* className  TEXT FIELD */}
              <Field name="className" type="text"
                className={errors.className  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="className" component="span" />
            </label>


        
            <label htmlFor="moduleType" className="nice-form-control">
              <b>Module Type: {touched.moduleType && !errors.moduleType && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="moduleType"
                className={errors.moduleType ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('moduleType', true);
                  setFieldValue('moduleType', e.target.value);
                }}
              >
                <option value="" label="Select Module Type" />
                <ModuleTypeLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="moduleType" component="span" />
            </label>


        
            <label htmlFor="moduleData" className="nice-form-control">
              <b>Module Data: {touched.moduleData && !errors.moduleData && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* moduleData  TEXT FIELD */}
              <Field name="moduleData" type="text"
                className={errors.moduleData  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="moduleData" component="span" />
            </label>


        
            <label htmlFor="status" className="nice-form-control">
              <b>Status: {touched.status && !errors.status && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="status"
                className={errors.status ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('status', true);
                  setFieldValue('status', e.target.value);
                }}
              >
                <option value="" label="Select Status" />
                <StatusLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="status" component="span" />
            </label>


        
            <label htmlFor="id" className="nice-form-control">
              <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* id  TEXT FIELD */}
              <Field name="id" type="text"
                className={errors.id  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="id" component="span" />
            </label>


        
            <label htmlFor="ownerId" className="nice-form-control">
              <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* ownerId  TEXT FIELD */}
              <Field name="ownerId" type="text"
                className={errors.ownerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="ownerId" component="span" />
            </label>


        
            <label htmlFor="createdDate" className="nice-form-control">
              <b>Created Date: {touched.createdDate && !errors.createdDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*createdDate DATE FIELD */}
              <Field name="createdDate" type="date"
                className={errors.createdDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="createdDate" component="span" />
            </label>


        
            <label htmlFor="keyHash" className="nice-form-control">
              <b>Key Hash: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* keyHash  TEXT FIELD */}
              <Field name="keyHash" type="text"
                className={errors.keyHash  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="keyHash" component="span" />
            </label>


        
            <label htmlFor="lastAccessedById" className="nice-form-control">
              <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastAccessedById  TEXT FIELD */}
              <Field name="lastAccessedById" type="text"
                className={errors.lastAccessedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastAccessedById" component="span" />
            </label>


        
            <label htmlFor="lastAccessedDate" className="nice-form-control">
              <b>Last Accessed Date: {touched.lastAccessedDate && !errors.lastAccessedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastAccessedDate DATE FIELD */}
              <Field name="lastAccessedDate" type="date"
                className={errors.lastAccessedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastAccessedDate" component="span" />
            </label>


        
            <label htmlFor="lastModifiedById" className="nice-form-control">
              <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastModifiedById  TEXT FIELD */}
              <Field name="lastModifiedById" type="text"
                className={errors.lastModifiedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastModifiedById" component="span" />
            </label>


        
            <label htmlFor="lastModifiedDate" className="nice-form-control">
              <b>Last Modified Date: {touched.lastModifiedDate && !errors.lastModifiedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastModifiedDate DATE FIELD */}
              <Field name="lastModifiedDate" type="date"
                className={errors.lastModifiedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastModifiedDate" component="span" />
            </label>

 
<br /><br />

                    <CoolButton
                      variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
                      type="submit"
                      onClick={() => { }}
                    >
                      {isSubmitting && (
                        <Spinner
                          style={ { float: "left" } }
                          as="span"
                          animation="grow"
                          variant="light"
                          aria-hidden="true"
                        />
                      )}
                      <FaCheckCircle size={30} /> Create New ExecModule
                    </CoolButton>


                        </Accordion.Body>
                      </Accordion.Item>
                    </Accordion>

          </form>
        )}
    </Formik>
    </div >
  );
};

/*

lowercase rolelookup
uppercase ROLELOOKUP
snakecase role_lookup
pascalcase RoleLookup
camelcase roleLookup
kebabcase role-lookup


*/

const RoleLookup = () => { 
  return(
  <>
    
    <option value='anonymous' label='Anonymous' />
    
    
    <option value='user' label='User' />
    
    
    <option value='admin' label='Admin' />
    
  </>
  )
};



/*

lowercase moduletypelookup
uppercase MODULETYPELOOKUP
snakecase module_type_lookup
pascalcase ModuleTypeLookup
camelcase moduleTypeLookup
kebabcase module-type-lookup


*/

const ModuleTypeLookup = () => { 
  return(
  <>
    
    <option value='broadcast' label='Broadcast' />
    
    
    <option value='io' label='Io' />
    
    
    <option value='reader' label='Reader' />
    
    
    <option value='writer' label='Writer' />
    
    
    <option value='transformer' label='Transformer' />
    
  </>
  )
};



/*

lowercase statuslookup
uppercase STATUSLOOKUP
snakecase status_lookup
pascalcase StatusLookup
camelcase statusLookup
kebabcase status-lookup


*/

const StatusLookup = () => { 
  return(
  <>
    
    <option value='running' label='Running' />
    
    
    <option value='stopped' label='Stopped' />
    
    
    <option value='ready' label='Ready' />
    
    
    <option value='good' label='Good' />
    
    
    <option value='warning' label='Warning' />
    
    
    <option value='error' label='Error' />
    
    
    <option value='disabled' label='Disabled' />
    
  </>
  )
};






export default ExecModuleForm;
