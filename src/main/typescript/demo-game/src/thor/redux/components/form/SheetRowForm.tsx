import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { SheetRow,  } from '../../../model';
import { useAddSheetRowMutation } from '../../services/SheetRowService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: SheetRow
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     sheetId: Yup.string()
    
    
    
    
    ,
     rowIndex: Yup.number()
    
    
    
    
    ,
    hidden: Yup.boolean()
    
    .oneOf([true], "The hidden value must be true.")
    
    
    ,
    collapsed: Yup.boolean()
    
    .oneOf([true], "The collapsed value must be true.")
    
    
    ,
     outlineLevel: Yup.number()
    
    
    
    
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

const SheetRowForm: React.FC = () => {
  const [addSheetRow, addSheetRowResult] = useAddSheetRowMutation();

  const initialValues: SheetRow = {
    
    
    sheetId : '3fa85f64-5717-4562-b3fc-2c963f66afa6',
    
    
    
    
    
    
    
    
    
    rowIndex : 0, 
    
    
    
    
    hidden : undefined,
    
    
    
    
    
    
    
    collapsed : undefined,
    
    
    
    
    
    
    
    
    
    
    outlineLevel : 0, 
    
    
    
    
    
    id : '3b7f97fb-5206-4a14-99de-31085fbf4f69',
    
    
    
    
    
    
    
    ownerId : '00961ae8-9f21-483d-8ab9-cc07da310199',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : 'b366341a-e457-49b3-a0c0-18b63559bea4',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : '0fda51fa-8ba5-4242-b1ad-19a0d31a7df5',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<SheetRow>) => {
    setTimeout(() => {
      console.log(values);
      addSheetRow(values);
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
                          addSheetRowResult: {JSON.stringify(addSheetRowResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New SheetRow</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="sheetId" className="nice-form-control">
              <b>Sheet Id: {touched.sheetId && !errors.sheetId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* sheetId  TEXT FIELD */}
              <Field name="sheetId" type="text"
                className={errors.sheetId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="sheetId" component="span" />
            </label>


        
            <label htmlFor="rowIndex" className="nice-form-control">
              <b>Row Index: {touched.rowIndex && !errors.rowIndex && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*rowIndex INTEGER FIELD */}
              <Field name="rowIndex" type="text"
                className={errors.rowIndex  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="rowIndex" component="span" />
            </label>


        
            <label htmlFor="hidden" className="nice-form-control">
              <b>Hidden: {touched.hidden && !errors.hidden && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="hidden"
                name="hidden"
                onChange={e => {
                  setFieldTouched('hidden', true);
                  setFieldValue('hidden', e.target.checked);
                }}
                isInvalid={!!errors.hidden }                  
                className={errors.hidden  ? 'error ' : ''} />
              <ErrorMessage className='error' name="hidden" component="span" />
            </label>


        
            <label htmlFor="collapsed" className="nice-form-control">
              <b>Collapsed: {touched.collapsed && !errors.collapsed && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="collapsed"
                name="collapsed"
                onChange={e => {
                  setFieldTouched('collapsed', true);
                  setFieldValue('collapsed', e.target.checked);
                }}
                isInvalid={!!errors.collapsed }                  
                className={errors.collapsed  ? 'error ' : ''} />
              <ErrorMessage className='error' name="collapsed" component="span" />
            </label>


        
            <label htmlFor="outlineLevel" className="nice-form-control">
              <b>Outline Level: {touched.outlineLevel && !errors.outlineLevel && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*outlineLevel INTEGER FIELD */}
              <Field name="outlineLevel" type="text"
                className={errors.outlineLevel  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="outlineLevel" component="span" />
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
                      <FaCheckCircle size={30} /> Create New SheetRow
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




export default SheetRowForm;
