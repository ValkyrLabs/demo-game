import Slider from 'rc-slider';
import 'rc-slider/assets/index.css';
import { useEffect, useState } from 'react';
import { Form as BSForm, Col, Row } from 'react-bootstrap';
import { CartesianGrid, Line, LineChart, Tooltip, XAxis, YAxis } from 'recharts';

// Sample DataObject array for testing purposes
const dataObjects: Array<any> = [
    {
        id: '1',
        ownerId: 'a72da0c5-cad6-4334-9a23-6affb79d6fb9',
        lineItemAmount: 400,
        someNumericValue: 123,
        anotherNumericValue: 234,
        status: 'APPROVED',
    },
    {
        id: '2',
        ownerId: 'b72da0c5-cad6-4334-9a23-6affb79d6fb9',
        
        lineItemAmount: 800,
        someNumericValue: 456,
        anotherNumericValue: 567,
        status: 'PENDING',
    },
    {
        id: '3',
        ownerId: 'c72da0c5-cad6-4334-9a23-6affb79d6fb9',

        lineItemAmount: 1200,
        someNumericValue: 789,
        anotherNumericValue: 890,
        status: 'REJECTED',
    }
];

const statusEnum = ['APPROVED', 'PENDING', 'REJECTED'];

const TimeSeriesChart = ({ data = dataObjects }) => {
    const [selectedXAxis, setSelectedXAxis] = useState('createdDate');
    const [selectedYAxis, setSelectedYAxis] = useState('');
    const [numericFields, setNumericFields] = useState([]);
    const [dateFields, setDateFields] = useState([]);
    const [enumFields, setEnumFields] = useState([]);
    const [sliderRange, setSliderRange] = useState([0, 100]);
    const [minDate, setMinDate] = useState(0);
    const [maxDate, setMaxDate] = useState(100);

    useEffect(() => {
        // Extract numeric, date, and enum fields dynamically from the data object
        if (data.length > 0) {
            const sampleDataObject = data[0];
            const numericKeys = Object.keys(sampleDataObject).filter(
                (key) => typeof sampleDataObject[key] === 'number'
            );
            const dateKeys = Object.keys(sampleDataObject).filter(
                (key) => new Date(sampleDataObject[key]).toString() !== 'Invalid Date'
            );
            const enumKeys = Object.keys(sampleDataObject).filter(
                (key) => statusEnum.includes(sampleDataObject[key])
            );
            setNumericFields(numericKeys);
            setDateFields(dateKeys);
            setEnumFields(enumKeys);

            // Set min and max dates for slider range
            const allDates = data.map(item => new Date(item[selectedXAxis]).getTime());
            const minDateValue = Math.min(...allDates);
            const maxDateValue = Math.max(...allDates);
            setMinDate(minDateValue);
            setMaxDate(maxDateValue);
            setSliderRange([minDateValue, maxDateValue]);
        }
    }, [data, selectedXAxis]);

    const handleXAxisChange = (e) => {
        setSelectedXAxis(e.target.value);
    };

    const handleYAxisChange = (e) => {
        setSelectedYAxis(e.target.value);
    };

    const handleSliderChange = (value) => {
        setSliderRange(value);
    };

    // Format the data for visualization
    const formattedData = data
        .map(item => ({
            ...item,
            createdDate: new Date(item.createdDate).getTime(),
            lastAccessedDate: new Date(item.lastAccessedDate).getTime(),
            lastModifiedDate: new Date(item.lastModifiedDate).getTime(),
        }))
        .filter(item => item[selectedXAxis] >= sliderRange[0] && item[selectedXAxis] <= sliderRange[1])
        .map(item => ({
            name: new Date(item[selectedXAxis]).toLocaleDateString(),
            ...numericFields.reduce((acc, key) => {
                acc[key] = item[key];
                return acc;
            }, {}),
            ...enumFields.reduce((acc, key) => {
                acc[key] = statusEnum.indexOf(item[key]);
                return acc;
            }, {})
        }));

    return (
        <div>
            <Row>
                <Col md={6}>
                    <div style={{ textAlign: 'center', marginBottom: '20px' }}>
                        <BSForm.Label style={{ color: '#ffffff', fontWeight: 'bold' }}>Select X Axis</BSForm.Label>
                        <BSForm.Control as="select" value={selectedXAxis} onChange={handleXAxisChange} style={{ width: '200px', margin: '0 auto', display: 'inline-block' }}>
                            {dateFields.map((field) => (
                                <option key={field} value={field}>{field}</option>
                            ))}
                        </BSForm.Control>
                    </div>
                </Col>
                <Col md={6}>
                    <div style={{ textAlign: 'center', marginBottom: '20px' }}>
                        <BSForm.Label style={{ color: '#ffffff', fontWeight: 'bold' }}>Select Y Axis</BSForm.Label>
                        <BSForm.Control as="select" value={selectedYAxis} onChange={handleYAxisChange} style={{ width: '200px', margin: '0 auto', display: 'inline-block' }}>
                            <option value="">All Numeric and Enum Fields</option>
                            {numericFields.concat(enumFields).map((field) => (
                                <option key={field} value={field}>{field}</option>
                            ))}
                        </BSForm.Control>
                    </div>
                </Col>
            </Row>
            <Row>
                <Col md={12}>
                    <div style={{ width: '50%', margin: '20px' }}>
                        <BSForm.Label>Adjust Date Range</BSForm.Label>
                        <Slider
                            range
                            min={minDate}
                            max={maxDate}
                            value={sliderRange}
                            onChange={handleSliderChange}
                           // tipFormatter={(value) => new Date(value).toLocaleDateString()}
                        />
                    </div>
                </Col>
            </Row>
            <LineChart width={800} height={400} data={formattedData} margin={{ top: 20, right: 30, left: 50, bottom: 20 }}>
                <CartesianGrid strokeDasharray="3 3" />
                <XAxis dataKey="name" />
                <YAxis />
                <Tooltip />
                {selectedYAxis ? (
                    <Line type="monotone" dataKey={selectedYAxis} stroke="#ff7f50" strokeWidth={2} />
                ) : (
                    numericFields.concat(enumFields).map((field, i) => (
                        <Line key={field} type="monotone" dataKey={field} stroke={i % 2 === 0 ? '#ff0000' : '#0000ff'} strokeWidth={2} />
                    ))
                )}
            </LineChart>
        </div>
    );
};

export default TimeSeriesChart;
